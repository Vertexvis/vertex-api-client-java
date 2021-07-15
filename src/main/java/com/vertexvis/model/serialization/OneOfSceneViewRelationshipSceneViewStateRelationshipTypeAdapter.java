package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.OneOfSceneViewRelationshipSceneViewStateRelationship;
import com.vertexvis.model.SceneViewRelationship;
import com.vertexvis.model.SceneViewRelationshipData;
import com.vertexvis.model.SceneViewStateRelationship;
import com.vertexvis.model.SceneViewStateRelationshipData;
import java.io.IOException;
import java.util.UUID;
import java.util.function.Supplier;

public class OneOfSceneViewRelationshipSceneViewStateRelationshipTypeAdapter
    extends TypeAdapter<OneOfSceneViewRelationshipSceneViewStateRelationship> {
  private final Supplier<Gson> gsonSupplier;

  public OneOfSceneViewRelationshipSceneViewStateRelationshipTypeAdapter(
      Supplier<Gson> gsonSupplier) {
    this.gsonSupplier = gsonSupplier;
  }

  @Override
  public void write(JsonWriter out, OneOfSceneViewRelationshipSceneViewStateRelationship value)
      throws IOException {
    out.jsonValue(gsonSupplier.get().toJson(value.getRel()));
  }

  @Override
  public OneOfSceneViewRelationshipSceneViewStateRelationship read(JsonReader in)
      throws IOException {
    String type = "";
    String id = "";

    in.beginObject();

    while (in.hasNext()) {
      switch (in.nextName()) {
        case "data":
          in.beginObject();
          break;
        case "type":
          type = in.nextString();
          break;
        case "id":
          id = in.nextString();
          break;
      }
    }
    in.endObject();
    in.endObject();

    switch (type) {
      case "scene-view":
        return new OneOfSceneViewRelationshipSceneViewStateRelationship(new SceneViewRelationship()
            .data(
                new SceneViewRelationshipData().type(SceneViewRelationshipData.TypeEnum.SCENE_VIEW)
                    .id(UUID.fromString(id))));
      case "scene-view-state":
        return new OneOfSceneViewRelationshipSceneViewStateRelationship(
            new SceneViewStateRelationship().data(new SceneViewStateRelationshipData()
                .type(SceneViewStateRelationshipData.TypeEnum.SCENE_VIEW_STATE)
                .id(UUID.fromString(id))));
      default:
        return null;
    }
  }
}
