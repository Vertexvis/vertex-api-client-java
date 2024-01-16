package com.vertexvis.model.serialization;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.*;

import java.io.IOException;
import java.util.function.Supplier;

public class OneOfWebhookEventSceneIncludedDataTypeAdapter extends TypeAdapter<OneOfWebhookEventSceneIncludedData> {
    private Supplier<Gson> gsonSupplier;

    public OneOfWebhookEventSceneIncludedDataTypeAdapter(Supplier<Gson> gsonSupplier) {
        this.gsonSupplier = gsonSupplier;
    }

    @Override
    public void write(JsonWriter out, OneOfWebhookEventSceneIncludedData value) throws IOException {
        TypeAdapter<JsonElement> jsonAdapter = gsonSupplier.get().getAdapter(JsonElement.class);
        TypeAdapter<WebhookEventSceneIncludedData> sceneIncludedDataTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(WebhookEventSceneIncludedData.class));

        if (value.getData() instanceof WebhookEventSceneIncludedData) {
            jsonAdapter.write(out, sceneIncludedDataTypeAdapter.toJsonTree(value.getSceneIncludedData()));
        }
    }

    @Override
    public OneOfWebhookEventSceneIncludedData read(JsonReader in) throws IOException {
        TypeAdapter<JsonElement> jsonAdapter = gsonSupplier.get().getAdapter(JsonElement.class);
        TypeAdapter<WebhookEventSceneIncludedData> sceneIncludedDataTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(WebhookEventSceneIncludedData.class));

        JsonObject json = jsonAdapter.read(in).getAsJsonObject();
        String type = json.get("type").getAsString();

        switch (type) {
            case "scene":
                return new OneOfWebhookEventSceneIncludedData(sceneIncludedDataTypeAdapter.fromJsonTree(json));
            default:
                throw new IOException("JSON deserializer not implemented for type " + type);
        }
    }
}