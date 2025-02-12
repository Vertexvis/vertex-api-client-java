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
    List<BatchVertexvisBatchResultsInner> list = new ArrayList<>();
    list.add(new BatchVertexvisBatchResultsInner(new RelationshipData().id(id).type("my-type")));
    Batch batch = new Batch().vertexvisBatchResults(list);

    String exp = "{\"vertexvis/batch:results\":[{\"id\":\"" + id + "\",\"type\":\"my-type\"}]}";

    assertEquals(exp, new JSON().serialize(batch));
  }

  @Test
  void deserializeRelationshipData() {
    UUID id = UUID.randomUUID();
    String in = "{\"vertexvis/batch:results\":[{\"id\":\"" + id + "\",\"type\":\"my-type\"}]}";

    Batch act = new JSON().deserialize(in, TypeToken.get(Batch.class).getType());
    BatchVertexvisBatchResultsInner exp =
        new BatchVertexvisBatchResultsInner(new RelationshipData().id(id).type("my-type"));

    assertEquals(exp.getActualInstance(), act.getVertexvisBatchResults().get(0).getActualInstance());
  }

  @Test
  void serializesApiError() {
    UUID id = UUID.randomUUID();
    List<BatchVertexvisBatchResultsInner> list = new ArrayList<>();
    list.add(new BatchVertexvisBatchResultsInner(
        new ApiError().id(id.toString()).status("my-status").code("500")));
    Batch batch = new Batch().vertexvisBatchResults(list);

    String exp = "{\"vertexvis/batch:results\":[{\"id\":\"" + id +
        "\",\"links\":{},\"status\":\"my-status\",\"code\":\"500\",\"meta\":{}}]}";

    assertEquals(exp, new JSON().serialize(batch));
  }

  @Test
  void deserializeApiError() {
    UUID id = UUID.randomUUID();
    String in = "{\"vertexvis/batch:results\":[{\"id\":\"" + id +
        "\",\"status\":\"my-status\",\"code\":\"500\"}]}";

    Batch act = new JSON().deserialize(in, TypeToken.get(Batch.class).getType());
    BatchVertexvisBatchResultsInner exp =
        new BatchVertexvisBatchResultsInner(
            new ApiError().id(id.toString()).status("my-status").code("500"));

    assertEquals(exp.getActualInstance(), act.getVertexvisBatchResults().get(0).getActualInstance());
  }

  @Test
  void deserializeApiErrorWithSource() {
    UUID id = UUID.randomUUID();
    String in = "{\"vertexvis/batch:results\":[{\"id\":\"" + id +
        "\",\"status\":\"my-status\",\"code\":\"500\",\"source\":{\"pointer\":\"/data/id\"}}]}";

    Batch act = new JSON().deserialize(in, TypeToken.get(Batch.class).getType());
    BatchVertexvisBatchResultsInner exp =
        new BatchVertexvisBatchResultsInner(
            new ApiError().id(id.toString()).status("my-status").code("500")
                .source(new ApiErrorSource().pointer("/data/id")));

    assertEquals(exp.getActualInstance(), act.getVertexvisBatchResults().get(0).getActualInstance());  }
}
