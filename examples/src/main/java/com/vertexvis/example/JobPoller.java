package com.vertexvis.example;

import com.vertexvis.model.QueuedJob;
import com.vertexvis.model.QueuedTranslationJob;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

class JobPoller {
  private static final long DEFAULT_WAIT_TIME_MS = 3000;

  public static final ScheduledExecutorService scheduler =
      Executors.newScheduledThreadPool(4);

  interface PollableQueuedJob {
    String getStatus();
    List<UUID> getIds();
  }
  record SceneItemQueuedJob(QueuedJob qj) implements PollableQueuedJob {
    @Override
    public String getStatus() {
      return qj.getData().getType().equals("scene-item") ? "complete" : "pending";
    }

    @Override
    public List<UUID> getIds() {
      return List.of(qj.getData().getId());
    }
  }

  record PartQueuedJob(QueuedTranslationJob qj) implements PollableQueuedJob {
    @Override
    public String getStatus() {
      return qj.getData().getAttributes().getStatus();
    }

    @Override
    public List<UUID> getIds() {
      return qj.getIncluded().stream()
          .map(inc -> inc.getPartRevisionData().getRelationships().getPart().getId())
          .toList();
    }
  }

  // public static CompletableFuture<UUID> pollUntilJobDoneAsync(String type,
  //                                                             Supplier<CompletableFuture<PollableQueuedJob>> f) {
  //   CompletableFuture<UUID> cf = new CompletableFuture<>();

  //   startChecking(cf, type, f);

  //   return cf;
  // }
  public static CompletableFuture<List<UUID>> pollUntilJobDoneAsync(String pollForStatus, Supplier<CompletableFuture<PollableQueuedJob>> jobFetcher) {
    return jobFetcher.get()
        .thenCompose(job -> {
            // Check if the job status matches what we expect
            if (job.getStatus().equals(pollForStatus)) {
                return CompletableFuture.completedFuture(job.getIds());
            }
            
            return CompletableFuture.supplyAsync(
                () -> {
                    try {
                        Thread.sleep(DEFAULT_WAIT_TIME_MS);
                        return pollUntilJobDoneAsync(pollForStatus, jobFetcher);
                    } catch (InterruptedException e) {
                        CompletableFuture<List<UUID>> future = new CompletableFuture<>();
                        future.completeExceptionally(e);
                        return future;
                    }
                }, scheduler
            ).thenCompose(Function.identity());
        });
}

  public static List<UUID> pollUntilJobDone(String pollForStatus, Supplier<PollableQueuedJob> f)
      throws InterruptedException {
    // Don't do this -- use a proper scheduler
    Thread.sleep(DEFAULT_WAIT_TIME_MS);

    PollableQueuedJob qj = f.get();

    if (qj.getStatus().equals(pollForStatus)) {
      return qj.getIds();
    } else {
      return pollUntilJobDone(pollForStatus, f);
    }
  }

  private static void startChecking(CompletableFuture<List<UUID>> resultF, String pollForStatus,
                                    Supplier<CompletableFuture<PollableQueuedJob>> f) {
    scheduler.schedule(() -> {
      f.get().thenAccept(qj -> {
        if (qj.getStatus().equals(pollForStatus)) {
          resultF.complete(qj.getIds());
        } else {
          startChecking(resultF, pollForStatus, f);
        }
      });

    }, DEFAULT_WAIT_TIME_MS, TimeUnit.MILLISECONDS);
  }
}
