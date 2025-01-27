package com.vertexvis.model;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.vertexvis.JSON;

import java.util.UUID;

import org.junit.jupiter.api.Test;

public class OneOfHitResultDataSceneItemDataPartRevisionDataTest {

  @Test
  void serializesHitResultData() {
    UUID id = UUID.randomUUID();
    HitIncludedInner d =
        new HitIncludedInner(
            new HitResultData().type("some-type").id(id));

    String expected = "{\"type\":\"some-type\",\"id\":\"" + id + "\"}";

    assertEquals(expected, new JSON().serialize(d));
  }

  @Test
  void serializesSceneItemData() {
    UUID id = UUID.randomUUID();
    HitIncludedInner d =
        new HitIncludedInner(
            new SceneItemData().id(id).type("scene-item"));

    String expected = "{\"type\":\"scene-item\",\"id\":\"" + id + "\",\"links\":{}}";

    assertEquals(expected, new JSON().serialize(d));
  }

  @Test
  void serializesPartRevisionData() {
    UUID id = UUID.randomUUID();
    HitIncludedInner d =
        new HitIncludedInner(
            new PartRevisionData().id(id).type("part-revision"));

    String expected = "{\"type\":\"part-revision\",\"id\":\"" + id + "\",\"links\":{}}";

    assertEquals(expected, new JSON().serialize(d));
  }
}


