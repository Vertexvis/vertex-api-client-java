package com.vertexvis.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.vertexvis.JSON;
import org.junit.jupiter.api.Test;

public class AnyOfCreateSceneItemRequestDataTest {

  @Test
  void serializesCreateSceneItemRequestData() {
    CreateSceneItemRequestData c =
        new CreateSceneItemRequestData().type("my-type")
            .attributes(new CreateSceneItemRequestDataAttributes().name("my-name"));

    String exp = "{\"type\":\"my-type\",\"attributes\":{\"name\":\"my-name\",\"metadata\":{},\"experimentalSourceMetadataKeys\":[]}}";

    assertEquals(exp, new JSON().serialize(c));
  }
}


