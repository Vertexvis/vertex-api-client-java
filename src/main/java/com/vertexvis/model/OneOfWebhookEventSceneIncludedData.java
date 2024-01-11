package com.vertexvis.model;

import javax.annotation.Nullable;

public class OneOfWebhookEventSceneIncludedData {

    private WebhookEventSceneIncludedData sceneIncludedData;
    public OneOfWebhookEventSceneIncludedData(WebhookEventSceneIncludedData data) {
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
