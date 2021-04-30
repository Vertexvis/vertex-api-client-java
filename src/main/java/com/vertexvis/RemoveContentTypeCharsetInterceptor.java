package com.vertexvis;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

public final class RemoveContentTypeCharsetInterceptor implements Interceptor {
  @NotNull
  @Override
  public Response intercept(Chain chain) throws IOException {
    Request origReq = chain.request();
    String origCt = origReq.headers().get("Content-Type");
    if ((origCt != null)) {
      String newCt = origCt.split(";")[0];
      return chain.proceed(origReq.newBuilder()
          .header("Content-Type", newCt)
          .build());
    } else {
      return chain.proceed(origReq);
    }
  }
}
