package com.vertexvis.model.serialization;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.*;

import java.io.IOException;
import java.util.function.Supplier;

public class OneOfWebhookEventSceneIncludedDataWebhookEventPartRevisionIncludedDataTypeAdapter extends TypeAdapter<OneOfWebhookEventSceneIncludedDataWebhookEventPartRevisionIncludedData> {
    private Supplier<Gson> gsonSupplier;

    public OneOfWebhookEventSceneIncludedDataWebhookEventPartRevisionIncludedDataTypeAdapter(Supplier<Gson> gsonSupplier) {
        this.gsonSupplier = gsonSupplier;
    }

    @Override
    public void write(JsonWriter out, OneOfWebhookEventSceneIncludedDataWebhookEventPartRevisionIncludedData value) throws IOException {
        TypeAdapter<JsonElement> jsonAdapter = gsonSupplier.get().getAdapter(JsonElement.class);
        TypeAdapter<WebhookEventSceneIncludedData> sceneIncludedDataTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(WebhookEventSceneIncludedData.class));
        TypeAdapter<WebhookEventPartRevisionIncludedData> partRevisionIncludedDataTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(WebhookEventPartRevisionIncludedData.class));

        if (value.getData() instanceof WebhookEventSceneIncludedData) {
            jsonAdapter.write(out, sceneIncludedDataTypeAdapter.toJsonTree(value.getSceneIncludedData()));
        } else if (value.getData() instanceof WebhookEventPartRevisionIncludedData) {
            jsonAdapter.write(out, partRevisionIncludedDataTypeAdapter.toJsonTree(value.getPartRevisionIncludedData()));
        }
    }

    @Override
    public OneOfWebhookEventSceneIncludedDataWebhookEventPartRevisionIncludedData read(JsonReader in) throws IOException {
        TypeAdapter<JsonElement> jsonAdapter = gsonSupplier.get().getAdapter(JsonElement.class);
        TypeAdapter<WebhookEventSceneIncludedData> sceneIncludedDataTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(WebhookEventSceneIncludedData.class));
        TypeAdapter<WebhookEventPartRevisionIncludedData> partRevisionIncludedDataTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(WebhookEventPartRevisionIncludedData.class));

        JsonObject json = jsonAdapter.read(in).getAsJsonObject();
        String type = json.get("type").getAsString();

        switch (type) {
            case "scene":
                return new OneOfWebhookEventSceneIncludedDataWebhookEventPartRevisionIncludedData(sceneIncludedDataTypeAdapter.fromJsonTree(json));
            case "part-revision":
                return new OneOfWebhookEventSceneIncludedDataWebhookEventPartRevisionIncludedData(partRevisionIncludedDataTypeAdapter.fromJsonTree(json));
            default:
                throw new IOException("JSON deserializer not implemented for type " + type);
        }
    }
}