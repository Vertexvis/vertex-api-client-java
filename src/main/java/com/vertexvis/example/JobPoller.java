package com.vertexvis.example;

import com.vertexvis.model.QueuedJob;

import java.util.UUID;
import java.util.function.Supplier;

class JobPoller {
  private static long DEFAULT_WAIT_TIME_MS = 3000;

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
}
