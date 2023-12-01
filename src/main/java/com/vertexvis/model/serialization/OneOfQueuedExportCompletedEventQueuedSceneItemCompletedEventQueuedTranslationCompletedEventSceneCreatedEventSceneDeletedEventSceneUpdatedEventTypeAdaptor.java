package com.vertexvis.model.serialization;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.*;

import java.io.IOException;
import java.util.function.Supplier;

public class OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEventTypeAdaptor extends TypeAdapter<OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent> {
    private Supplier<Gson> gsonSupplier;

    public OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEventTypeAdaptor(Supplier<Gson> gsonSupplier) {
        this.gsonSupplier = gsonSupplier;
    }

    @Override
    public void write(JsonWriter out, OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent value) throws IOException {
        TypeAdapter<JsonElement> jsonAdapter = gsonSupplier.get().getAdapter(JsonElement.class);
        TypeAdapter<QueuedExportCompletedEvent> queuedExportCompletedEventTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(QueuedExportCompletedEvent.class));
        TypeAdapter<QueuedTranslationCompletedEvent> queuedTranslationCompletedEventTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(QueuedTranslationCompletedEvent.class));
        TypeAdapter<QueuedSceneItemCompletedEvent> queuedSceneItemCompletedEventTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(QueuedSceneItemCompletedEvent.class));
        TypeAdapter<SceneCreatedEvent> sceneCreatedEventTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(SceneCreatedEvent.class));
        TypeAdapter<SceneDeletedEvent> sceneDeletedEventTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(SceneDeletedEvent.class));
        TypeAdapter<SceneUpdatedEvent> sceneUpdatedEventTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(SceneUpdatedEvent.class));

        if (value.getData() instanceof QueuedExportCompletedEvent) {
            JsonElement el = queuedExportCompletedEventTypeAdapter.toJsonTree(value.getQueuedExportCompletedEvent());
            jsonAdapter.write(out, el);
        } else if (value.getData() instanceof QueuedTranslationCompletedEvent) {
            jsonAdapter.write(out, queuedTranslationCompletedEventTypeAdapter.toJsonTree(value.getQueuedTranslationCompletedEvent()));
        } else if (value.getData() instanceof QueuedSceneItemCompletedEvent) {
            jsonAdapter.write(out, queuedSceneItemCompletedEventTypeAdapter.toJsonTree(value.getQueuedSceneItemCompletedEvent()));
        } else if (value.getData() instanceof SceneCreatedEvent) {
            jsonAdapter.write(out, sceneCreatedEventTypeAdapter.toJsonTree(value.getSceneCreatedEvent()));
        } else if (value.getData() instanceof SceneDeletedEvent) {
            jsonAdapter.write(out, sceneDeletedEventTypeAdapter.toJsonTree(value.getSceneDeletedEvent()));
        } else if (value.getData() instanceof SceneUpdatedEvent) {
            jsonAdapter.write(out, sceneUpdatedEventTypeAdapter.toJsonTree(value.getSceneUpdatedEvent()));
        }
    }

    @Override
    public OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent read(JsonReader in) throws IOException {
        TypeAdapter<JsonElement> jsonAdapter = gsonSupplier.get().getAdapter(JsonElement.class);
        TypeAdapter<QueuedExportCompletedEvent> queuedExportCompletedEventTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(QueuedExportCompletedEvent.class));
        TypeAdapter<QueuedTranslationCompletedEvent> queuedTranslationCompletedEventTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(QueuedTranslationCompletedEvent.class));
        TypeAdapter<QueuedSceneItemCompletedEvent> queuedSceneItemCompletedEventTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(QueuedSceneItemCompletedEvent.class));
        TypeAdapter<SceneCreatedEvent> sceneCreatedEventTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(SceneCreatedEvent.class));
        TypeAdapter<SceneDeletedEvent> sceneDeletedEventTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(SceneDeletedEvent.class));
        TypeAdapter<SceneUpdatedEvent> sceneUpdatedEventTypeAdapter = gsonSupplier.get().getAdapter(TypeToken.get(SceneUpdatedEvent.class));

        JsonObject json = jsonAdapter.read(in).getAsJsonObject();
        String topic = json.get("topic").getAsString();

        switch (topic) {
            case "queued-export.completed":
                return new OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(queuedExportCompletedEventTypeAdapter.fromJsonTree(json));
            case "queued-translation.completed":
                return new OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(queuedTranslationCompletedEventTypeAdapter.fromJsonTree(json));
            case "queued-scene-item.completed":
                return new OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(queuedSceneItemCompletedEventTypeAdapter.fromJsonTree(json));
            case "scene.created":
                return new OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(sceneCreatedEventTypeAdapter.fromJsonTree(json));
            case "scene.deleted":
                return new OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(sceneDeletedEventTypeAdapter.fromJsonTree(json));
            case "scene.updated":
                return new OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(sceneUpdatedEventTypeAdapter.fromJsonTree(json));
            default:
                throw new IOException("JSON deserializer not implemented for topic " + topic);
        }
    }
}
