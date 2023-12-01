package com.vertexvis.model;

import com.vertexvis.JSON;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEventTypeTest {
    private JSON json = new JSON();

    @Test
    void testQueuedExportCompletedEvent() {
        OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent expected = new OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(new QueuedExportCompletedEvent()
                .topic("queued-export.completed")
                .created(OffsetDateTime.now()));

        String serialized = json.serialize(expected);
        OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent actual = json.deserialize(serialized, OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent.class);

        assertEquals(expected, actual);
    }

    @Test
    void testQueuedTranslationCompletedEvent() {
        OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent expected = new OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(new QueuedTranslationCompletedEvent()
                .topic("queued-translation.completed")
                .created(OffsetDateTime.now()));

        String serialized = json.serialize(expected);
        OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent actual = json.deserialize(serialized, OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent.class);

        assertEquals(expected, actual);
    }

    @Test
    void testQueuedSceneItemCompletedEvent() {
        OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent expected = new OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(new QueuedSceneItemCompletedEvent()
                .topic("queued-scene-item.completed")
                .created(OffsetDateTime.now()));

        String serialized = json.serialize(expected);
        OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent actual = json.deserialize(serialized, OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent.class);

        assertEquals(expected, actual);
    }

    @Test
    void testSceneCreatedEvent() {
        OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent expected = new OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(new SceneCreatedEvent()
                .topic("scene.created")
                .created(OffsetDateTime.now())
                .putMetadataItem("foo", "bar"));

        String serialized = json.serialize(expected);
        OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent actual = json.deserialize(serialized, OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent.class);

        assertEquals(expected, actual);
    }

    @Test
    void testSceneDeletedEvent() {
        OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent expected = new OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(new SceneDeletedEvent()
                .topic("scene.deleted")
                .created(OffsetDateTime.now())
                .putMetadataItem("foo", "bar"));

        String serialized = json.serialize(expected);
        OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent actual = json.deserialize(serialized, OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent.class);

        assertEquals(expected, actual);
    }

    @Test
    void testSceneUpdatedEvent() {
        OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent expected = new OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(new SceneUpdatedEvent()
                .topic("scene.updated")
                .created(OffsetDateTime.now())
                .putMetadataItem("foo", "bar"));

        String serialized = json.serialize(expected);
        OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent actual = json.deserialize(serialized, OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent.class);

        assertEquals(expected, actual);
    }
}
