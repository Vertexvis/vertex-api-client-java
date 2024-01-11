package com.vertexvis.model;

import javax.annotation.Nullable;

public class AnyOfWebhookEventSceneIncludedData {

    private WebhookEventSceneIncludedData sceneIncludedData;
    public AnyOfWebhookEventSceneIncludedData(WebhookEventSceneIncludedData data) {
        this.sceneIncludedData = data;
    }

    public Object getData() {
        if (this.sceneIncludedData != null) {
            return this.sceneIncludedData;
        }

        return null;
    }

    @Nullable
    public WebhookEventSceneIncludedData getSceneIncludedData() {
        return this.sceneIncludedData;
    }

}
