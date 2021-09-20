package com.vertexvis.model;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.google.gson.reflect.TypeToken;
import com.vertexvis.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;

public class AnyOfRelationshipDataApiErrorAdapterTest {

  @Test
  void serializesRelationshipData() {
    UUID id = UUID.randomUUID();
    List<AnyOfRelationshipDataApiError> list = new ArrayList<>();
    list.add(new AnyOfRelationshipDataApiError(new RelationshipData().id(id).type("my-type")));
    Batch batch = new Batch().vertexvisBatchColonResults(list);

    String exp = "{\"vertexvis/batch:results\":[{\"id\":\"" + id + "\",\"type\":\"my-type\"}]}";

    assertEquals(exp, new JSON().serialize(batch));
  }

  @Test
  void deserializeRelationshipData() {
    UUID id = UUID.randomUUID();
    String in = "{\"vertexvis/batch:results\":[{\"id\":\"" + id + "\",\"type\":\"my-type\"}]}";

    Batch act = new JSON().deserialize(in, TypeToken.get(Batch.class).getType());
    AnyOfRelationshipDataApiError exp =
        new AnyOfRelationshipDataApiError(new RelationshipData().id(id).type("my-type"));

    assertEquals(exp.getObj(), act.getVertexvisBatchColonResults().get(0).getObj());
  }

  @Test
  void serializesApiError() {
    UUID id = UUID.randomUUID();
    List<AnyOfRelationshipDataApiError> list = new ArrayList<>();
    list.add(new AnyOfRelationshipDataApiError(
        new ApiError().id(id.toString()).status("my-status").code("500")));
    Batch batch = new Batch().vertexvisBatchColonResults(list);

    String exp = "{\"vertexvis/batch:results\":[{\"id\":\"" + id +
        "\",\"status\":\"my-status\",\"code\":\"500\"}]}";

    assertEquals(exp, new JSON().serialize(batch));
  }

  @Test
  void deserializeApiError() {
    UUID id = UUID.randomUUID();
    String in = "{\"vertexvis/batch:results\":[{\"id\":\"" + id +
        "\",\"status\":\"my-status\",\"code\":\"500\"}]}";

    Batch act = new JSON().deserialize(in, TypeToken.get(Batch.class).getType());
    AnyOfRelationshipDataApiError exp =
        new AnyOfRelationshipDataApiError(
            new ApiError().id(id.toString()).status("my-status").code("500"));

    assertEquals(exp.getObj(), act.getVertexvisBatchColonResults().get(0).getObj());
  }

  @Test
  void deserializeApiErrorWithSource() {
    UUID id = UUID.randomUUID();
    String in = "{\"vertexvis/batch:results\":[{\"id\":\"" + id +
        "\",\"status\":\"my-status\",\"code\":\"500\",\"source\":{\"pointer\":\"/data/id\"}}]}";

    Batch act = new JSON().deserialize(in, TypeToken.get(Batch.class).getType());
    AnyOfRelationshipDataApiError exp =
        new AnyOfRelationshipDataApiError(
            new ApiError().id(id.toString()).status("my-status").code("500")
                .source(new ApiErrorSource().pointer("/data/id")));

    assertEquals(exp.getObj(), act.getVertexvisBatchColonResults().get(0).getObj());
  }
}
