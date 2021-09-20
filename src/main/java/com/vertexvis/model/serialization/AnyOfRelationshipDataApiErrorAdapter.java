package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.AnyOfRelationshipDataApiError;
import com.vertexvis.model.ApiError;
import com.vertexvis.model.ApiErrorSource;
import com.vertexvis.model.RelationshipData;

import java.io.IOException;
import java.util.UUID;
import java.util.function.Supplier;

public class AnyOfRelationshipDataApiErrorAdapter
    extends TypeAdapter<AnyOfRelationshipDataApiError> {
  private final Supplier<Gson> gsonSupplier;

  public AnyOfRelationshipDataApiErrorAdapter(
      Supplier<Gson> gsonSupplier) {
    this.gsonSupplier = gsonSupplier;
  }

  @Override
  public void write(JsonWriter out,
                    AnyOfRelationshipDataApiError value)
      throws IOException {
    out.jsonValue(gsonSupplier.get().toJson(value.getObj()));
  }

  @Override
  public AnyOfRelationshipDataApiError read(JsonReader in)
      throws IOException {
    String id = "";
    String type = null;
    String status = null;
    String code = null;
    String title = null;
    String detail = null;
    boolean hasSource = false;
    String pointer = null;
    String parameter = null;

    in.beginObject();
    while (in.hasNext()) {
      switch (in.nextName()) {
        case "id":
          id = in.nextString();
          break;
        case "type":
          type = in.nextString();
          break;
        case "status":
          status = in.nextString();
          break;
        case "code":
          code = in.nextString();
          break;
        case "title":
          title = in.nextString();
          break;
        case "detail":
          detail = in.nextString();
          break;
        case "source":
          hasSource = true;
          in.beginObject();
          break;
        case "pointer":
          pointer = in.nextString();
          break;
        case "parameter":
          parameter = in.nextString();
          break;
      }
    }
    in.endObject();
    if (hasSource) {
      in.endObject();
    }

    if (!isNullOrEmpty(type)) {
      return new AnyOfRelationshipDataApiError(
          new RelationshipData().id(UUID.fromString(id)).type(type));
    }

    ApiError ae = new ApiError().id(id).status(status).code(code).title(title).detail(detail);
    return new AnyOfRelationshipDataApiError(
        hasSource ? ae.source(new ApiErrorSource().pointer(pointer).parameter(parameter)) : ae);
  }

  private static boolean isNullOrEmpty(String s) {
    return s == null || s.trim().length() == 0;
  }
}
