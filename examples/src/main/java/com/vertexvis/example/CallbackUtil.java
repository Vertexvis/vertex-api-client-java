package com.vertexvis.example;

import com.vertexvis.ApiCallback;
import com.vertexvis.ApiException;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

class CallbackUtil {
  public static <T> CompletableFuture<T> execute(Consumer<ApiCallback<T>> callbackConsumer) {
    CompletableFuture<T> cf = new CompletableFuture<>();

    callbackConsumer.accept(new ApiCallback<T>() {
      @Override
      public void onFailure(ApiException e, int statusCode,
                            Map<String, List<String>> responseHeaders) {
        cf.completeExceptionally(e);
      }

      @Override
      public void onSuccess(T result, int statusCode, Map<String, List<String>> responseHeaders) {
        cf.complete(result);
      }

      @Override
      public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {

      }

      @Override
      public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {

      }
    });

    return cf;
  }
}
