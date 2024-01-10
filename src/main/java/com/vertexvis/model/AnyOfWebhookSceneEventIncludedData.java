package com.vertexvis.model;

import javax.annotation.Nullable;

public class AnyOfWebhookSceneEventIncludedData {

    private WebhookSceneEventIncludedData sceneEventIncludedData;
    public AnyOfWebhookSceneEventIncludedData(WebhookSceneEventIncludedData data) {
        this.sceneEventIncludedData = data;
    }

    public Object getData() {
        if (this.sceneEventIncludedData != null) {
            return this.sceneEventIncludedData;
        }

        return null;
    }

    @Nullable
    public WebhookSceneEventIncludedData getSceneEventIncludedData() {
        return this.sceneEventIncludedData;
    }

}
