package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.*;

import java.io.IOException;
import java.util.function.Supplier;

public class OneOfUpdateItemToDefaultRenditionOperationTypeAdapter extends TypeAdapter<OneOfUpdateItemToDefaultRenditionOperation> {
    private final Supplier<Gson> gsonSupplier;
    public OneOfUpdateItemToDefaultRenditionOperationTypeAdapter(Supplier<Gson> gsonSupplier) {
        this.gsonSupplier = gsonSupplier;
    }

    @Override
    public void write(JsonWriter out, OneOfUpdateItemToDefaultRenditionOperation value)
        throws IOException {
        if (value != null && value.getData() != null) {
            out.jsonValue(gsonSupplier.get().toJson(value.getData()));
        }
        else {
            out.jsonValue(null);
        }
    }

    @Override
    public OneOfUpdateItemToDefaultRenditionOperation read(JsonReader in) throws IOException {
        TypeAdapter<JsonElement> jsonAdapter = gsonSupplier.get().getAdapter(JsonElement.class);
        TypeAdapter<UpdateItemToDefaultRenditionOperation> updateItemToDefaultRenditionOperationTypeAdapter =
            gsonSupplier.get().getAdapter(TypeToken.get(UpdateItemToDefaultRenditionOperation.class));

        JsonObject json = jsonAdapter.read(in).getAsJsonObject();
        String type = json.get("type").getAsString();

        switch (type) {
            case "update-to-default-rendition":
                return new OneOfUpdateItemToDefaultRenditionOperation(
                    updateItemToDefaultRenditionOperationTypeAdapter.fromJsonTree(json)
                );
            default:
                throw new IOException("JSON deserializer not implemented for type " + type);
        }
    }
}
