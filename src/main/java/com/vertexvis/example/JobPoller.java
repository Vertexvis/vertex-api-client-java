package com.vertexvis.example;

import com.vertexvis.model.QueuedJob;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

class JobPoller {
    private static long DEFAULT_WAIT_TIME_MS = 3000;

    private static final ScheduledExecutorService scheduler =
            Executors.newScheduledThreadPool(4);

    public static CompletableFuture<UUID> pollUntilJobDoneAsync(String type, Supplier<CompletableFuture<QueuedJob>> f) {
        CompletableFuture<UUID> cf = new CompletableFuture<>();

        startChecking(cf, type, f);

        return cf;
    }

    public static UUID pollUntilJobDone(String type, Supplier<QueuedJob> f)
            throws InterruptedException {
        // Don't do this -- use a proper scheduler
        Thread.sleep(DEFAULT_WAIT_TIME_MS);

        QueuedJob qj = f.get();

        if (qj.getData().getType().equals(type)) {
            return qj.getData().getId();
        } else {
            return pollUntilJobDone(type, f);
        }
    }

    private static void startChecking(CompletableFuture<UUID> resultF, String type, Supplier<CompletableFuture<QueuedJob>> f) {
        scheduler.schedule(() -> {
            f.get().thenAccept(qj -> {
                if (qj.getData().getType().equals(type)) {
                    resultF.complete(qj.getData().getId());
                } else {
                    startChecking(resultF, type, f);
                }
            });

        }, DEFAULT_WAIT_TIME_MS, TimeUnit.MILLISECONDS);
    }
}
