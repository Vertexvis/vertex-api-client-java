package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.*;

import java.io.IOException;
import java.util.UUID;
import java.util.function.Supplier;

public class AnyOfGeometrySetRelationshipPartRevisionRelationshipTypeAdapter extends TypeAdapter<AnyOfGeometrySetRelationshipPartRevisionRelationship> {
    private final Supplier<Gson> gsonSupplier;

    public AnyOfGeometrySetRelationshipPartRevisionRelationshipTypeAdapter(Supplier<Gson> gsonSupplier) {
        this.gsonSupplier = gsonSupplier;
    }

    @Override
    public void write(JsonWriter out, AnyOfGeometrySetRelationshipPartRevisionRelationship value) throws IOException {
        out.jsonValue(gsonSupplier.get().toJson(value.getRel()));
    }

    @Override
    public AnyOfGeometrySetRelationshipPartRevisionRelationship read(JsonReader in) throws IOException {
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
                return new AnyOfGeometrySetRelationshipPartRevisionRelationship(new PartRevisionRelationship().data(new PartDataRelationshipsPartRevisions().type(PartDataRelationshipsPartRevisions.TypeEnum.PART_REVISION).id(UUID.fromString(id))));
            case "geometry-set":
                return new AnyOfGeometrySetRelationshipPartRevisionRelationship(new GeometrySetRelationship().data(new GeometrySetRelationshipData().type(GeometrySetRelationshipData.TypeEnum.GEOMETRY_SET).id(UUID.fromString(id))));
            default:
                return null;
        }
    }
}
