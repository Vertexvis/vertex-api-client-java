package com.vertexvis.model;

import javax.annotation.Nullable;

public class OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent {
    private QueuedExportCompletedEvent queuedExportCompletedEvent;
    private QueuedSceneItemCompletedEvent queuedSceneItemCompletedEvent;
    private QueuedTranslationCompletedEvent queuedTranslationCompletedEvent;
    private SceneCreatedEvent sceneCreatedEvent;
    private SceneDeletedEvent sceneDeletedEvent;
    private SceneUpdatedEvent sceneUpdatedEvent;

    public OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(QueuedExportCompletedEvent event) {
        this.queuedExportCompletedEvent = event;
    }

    public OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(QueuedSceneItemCompletedEvent event) {
        this.queuedSceneItemCompletedEvent = event;
    }

    public OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(QueuedTranslationCompletedEvent event) {
        this.queuedTranslationCompletedEvent = event;
    }

    public OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(SceneCreatedEvent event) {
        this.sceneCreatedEvent = event;
    }

    public OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(SceneDeletedEvent event) {
        this.sceneDeletedEvent = event;
    }

    public OneOfQueuedExportCompletedEventQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(SceneUpdatedEvent event) {
        this.sceneUpdatedEvent = event;
    }

    public Object getData() {
        if (this.queuedExportCompletedEvent != null) {
            return this.queuedExportCompletedEvent;
        }
        if (this.queuedSceneItemCompletedEvent != null) {
            return this.queuedSceneItemCompletedEvent;
        }
        if (this.queuedTranslationCompletedEvent != null) {
            return this.queuedTranslationCompletedEvent;
        }
        if (this.sceneCreatedEvent != null) {
            return this.sceneCreatedEvent;
        }
        if (this.sceneDeletedEvent != null) {
            return this.sceneUpdatedEvent;
        }
        if (this.sceneUpdatedEvent != null) {
            return this.sceneUpdatedEvent;
        }
        return null;
    }

    @Nullable
    public QueuedExportCompletedEvent getQueuedExportCompletedEvent() {
        return queuedExportCompletedEvent;
    }

    @Nullable
    public QueuedSceneItemCompletedEvent getQueuedSceneItemCompletedEvent() {
        return queuedSceneItemCompletedEvent;
    }

    @Nullable
    public QueuedTranslationCompletedEvent getQueuedTranslationCompletedEvent() {
        return queuedTranslationCompletedEvent;
    }

    @Nullable
    public SceneCreatedEvent getSceneCreatedEvent() {
        return sceneCreatedEvent;
    }

    @Nullable
    public SceneDeletedEvent getSceneDeletedEvent() {
        return sceneDeletedEvent;
    }

    @Nullable
    public SceneUpdatedEvent getSceneUpdatedEvent() {
        return sceneUpdatedEvent;
    }
}
