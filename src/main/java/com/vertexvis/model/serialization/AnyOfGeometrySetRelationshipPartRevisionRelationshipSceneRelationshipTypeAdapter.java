package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationshipPartRenditionRelationship;
import com.vertexvis.model.GeometrySetRelationship;
import com.vertexvis.model.GeometrySetRelationshipData;
import com.vertexvis.model.PartDataRelationshipsPartRevisions;
import com.vertexvis.model.PartRevisionRelationship;
import com.vertexvis.model.SceneRelationship;
import com.vertexvis.model.SceneRelationshipData;

import java.io.IOException;
import java.util.UUID;
import java.util.function.Supplier;

public class AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationshipTypeAdapter
    extends TypeAdapter<AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationshipPartRenditionRelationship> {
  private final Supplier<Gson> gsonSupplier;

  public AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationshipTypeAdapter(
      Supplier<Gson> gsonSupplier) {
    this.gsonSupplier = gsonSupplier;
  }

  @Override
  public void write(JsonWriter out,
                    AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationshipPartRenditionRelationship value)
      throws IOException {
    out.jsonValue(gsonSupplier.get().toJson(value.getRel()));
  }

  @Override
  public AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationshipPartRenditionRelationship read(JsonReader in)
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
      case "part-revision":
        return new AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationshipPartRenditionRelationship(
            new PartRevisionRelationship().data(new PartDataRelationshipsPartRevisions()
                .type(PartDataRelationshipsPartRevisions.TypeEnum.PART_REVISION)
                .id(UUID.fromString(id))));
      case "geometry-set":
        return new AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationshipPartRenditionRelationship(
            new GeometrySetRelationship().data(new GeometrySetRelationshipData()
                .type(GeometrySetRelationshipData.TypeEnum.GEOMETRY_SET).id(UUID.fromString(id))));
      case "scene":
        return new AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationshipPartRenditionRelationship(
            new SceneRelationship().data(
                new SceneRelationshipData().type(SceneRelationshipData.TypeEnum.SCENE)
                    .id(UUID.fromString(id))));
      default:
        return null;
    }
  }
}
