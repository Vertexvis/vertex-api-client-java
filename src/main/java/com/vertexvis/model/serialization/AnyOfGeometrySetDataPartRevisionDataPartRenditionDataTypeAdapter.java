package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.AnyOfGeometrySetDataPartRevisionDataPartRenditionData;
import com.vertexvis.model.GeometrySetData;
import com.vertexvis.model.PartRendition;
import com.vertexvis.model.PartRenditionData;
import com.vertexvis.model.PartRevisionData;

import java.io.IOException;
import java.util.function.Supplier;

public class AnyOfGeometrySetDataPartRevisionDataPartRenditionDataTypeAdapter extends TypeAdapter<AnyOfGeometrySetDataPartRevisionDataPartRenditionData>
{
    private final Supplier<Gson> gsonSupplier;

    public AnyOfGeometrySetDataPartRevisionDataPartRenditionDataTypeAdapter(Supplier<Gson> gsonSupplier) {
        this.gsonSupplier = gsonSupplier;
    }

    @Override
    public void write(JsonWriter out, AnyOfGeometrySetDataPartRevisionDataPartRenditionData value)
        throws IOException {
        if (value != null && value.getRel() != null) {
            out.jsonValue(gsonSupplier.get().toJson(value.getRel()));
        }
        else {
            out.jsonValue(null);
        }
    }

    @Override
    public AnyOfGeometrySetDataPartRevisionDataPartRenditionData read(JsonReader in) throws IOException {
        TypeAdapter<JsonElement> jsonAdapter = gsonSupplier.get().getAdapter(JsonElement.class);
        TypeAdapter<PartRevisionData> partRevisionDataTypeAdapter =
            gsonSupplier.get().getAdapter(TypeToken.get(PartRevisionData.class));
        TypeAdapter<GeometrySetData> geometrySetDataTypeAdapter =
            gsonSupplier.get().getAdapter(TypeToken.get(GeometrySetData.class));
        TypeAdapter<PartRenditionData> partRenditionDataTypeAdapter =
            gsonSupplier.get().getAdapter(TypeToken.get(PartRenditionData.class));

        JsonObject json = jsonAdapter.read(in).getAsJsonObject();
        String type = json.get("type").getAsString();

        return switch (type) {
            case "part-revision" -> new AnyOfGeometrySetDataPartRevisionDataPartRenditionData(
                partRevisionDataTypeAdapter.fromJsonTree(json)
            );
            case "geometry-set" -> new AnyOfGeometrySetDataPartRevisionDataPartRenditionData(
                geometrySetDataTypeAdapter.fromJsonTree(json)
            );
            case "part-rendition" -> new AnyOfGeometrySetDataPartRevisionDataPartRenditionData(
                partRenditionDataTypeAdapter.fromJsonTree(json)
            );
            default -> throw new IOException("JSON deserializer not implemented for type " + type);
        };
    }
}
