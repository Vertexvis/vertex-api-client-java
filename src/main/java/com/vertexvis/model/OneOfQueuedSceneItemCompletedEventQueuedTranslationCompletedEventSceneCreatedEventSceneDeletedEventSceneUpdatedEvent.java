package com.vertexvis.model;

import javax.annotation.Nullable;

public class OneOfQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent {
    private QueuedSceneItemCompletedEvent queuedSceneItemCompletedEvent;
    private QueuedTranslationCompletedEvent queuedTranslationCompletedEvent;
    private SceneCreatedEvent sceneCreatedEvent;
    private SceneDeletedEvent sceneDeletedEvent;
    private SceneUpdatedEvent sceneUpdatedEvent;

    public OneOfQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(QueuedSceneItemCompletedEvent event) {
        this.queuedSceneItemCompletedEvent = event;
    }

    public OneOfQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(QueuedTranslationCompletedEvent event) {
        this.queuedTranslationCompletedEvent = event;
    }

    public OneOfQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(SceneCreatedEvent event) {
        this.sceneCreatedEvent = event;
    }

    public OneOfQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(SceneDeletedEvent event) {
        this.sceneDeletedEvent = event;
    }

    public OneOfQueuedSceneItemCompletedEventQueuedTranslationCompletedEventSceneCreatedEventSceneDeletedEventSceneUpdatedEvent(SceneUpdatedEvent event) {
        this.sceneUpdatedEvent = event;
    }

    public Object getData() {
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
