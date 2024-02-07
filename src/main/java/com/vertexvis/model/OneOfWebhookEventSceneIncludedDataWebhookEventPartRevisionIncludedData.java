package com.vertexvis.model;

import javax.annotation.Nullable;

public class OneOfWebhookEventSceneIncludedDataWebhookEventPartRevisionIncludedData {

    private WebhookEventSceneIncludedData sceneIncludedData;
    private WebhookEventPartRevisionIncludedData partRevisionIncludedData;

    public OneOfWebhookEventSceneIncludedDataWebhookEventPartRevisionIncludedData(WebhookEventSceneIncludedData data) {
        this.sceneIncludedData = data;
    }

    public OneOfWebhookEventSceneIncludedDataWebhookEventPartRevisionIncludedData(WebhookEventPartRevisionIncludedData data) {
        this.partRevisionIncludedData = data;
    }

    public Object getData() {
        if (this.sceneIncludedData != null) {
            return this.sceneIncludedData;
        } else if (this.partRevisionIncludedData != null) {
            return this.partRevisionIncludedData;
        }

        return null;
    }

    @Nullable
    public WebhookEventSceneIncludedData getSceneIncludedData() {
        return this.sceneIncludedData;
    }

    @Nullable
    public WebhookEventPartRevisionIncludedData getPartRevisionIncludedData() {
        return partRevisionIncludedData;
    }
}
