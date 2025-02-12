package com.vertexvis.example;

import com.vertexvis.model.GetQueuedSceneItem200Response;
import com.vertexvis.model.QueuedJob;
import com.vertexvis.model.QueuedTranslationJob;
import com.vertexvis.model.SceneItem;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

class JobPoller {
  private static final long DEFAULT_WAIT_TIME_MS = 3000;

  private static final ScheduledExecutorService scheduler =
      Executors.newScheduledThreadPool(4);

  public static CompletableFuture<UUID> pollUntilJobDoneAsync(String type,
                                                              Supplier<CompletableFuture<QueuedTranslationJob>> f) {
    CompletableFuture<UUID> cf = new CompletableFuture<>();

    startChecking(cf, type, f);

    return cf;
  }

  public static UUID pollSceneJobUntilDone(String type, Supplier<GetQueuedSceneItem200Response> f)
          throws InterruptedException {
    do {
      GetQueuedSceneItem200Response qj = f.get();

      if (qj.getActualInstance() instanceof SceneItem) {
        return qj.getSceneItem().getData().getId();
      }
      // Don't do this -- use a proper scheduler
      Thread.sleep(DEFAULT_WAIT_TIME_MS);
    } while (true);
  }

  public static UUID pollUntilJobDone(String type, Supplier<QueuedJob> f)
      throws InterruptedException {

    do {
      QueuedJob qj = f.get();

      if (qj.getData().getType().equals(type)) {
        return qj.getData().getId();
      }
      // Don't do this -- use a proper scheduler
      Thread.sleep(DEFAULT_WAIT_TIME_MS);
    } while (true);
  }

  private static void startChecking(CompletableFuture<UUID> resultF, String type,
                                    Supplier<CompletableFuture<QueuedTranslationJob>> f) {
    scheduler.schedule(() -> {
      f.get().thenAccept(qj -> {
        if (qj.getData().getType().equals(type)) {
          resultF.complete(qj.getIncluded().get(0).getPartRevisionData().getRelationships().getPart().getId());
        } else {
          startChecking(resultF, type, f);
        }
      });

    }, DEFAULT_WAIT_TIME_MS, TimeUnit.MILLISECONDS);
  }
}
