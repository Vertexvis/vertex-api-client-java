package com.vertexvis.model;

import javax.annotation.Nullable;

public class OneOfCreateSceneAlterationRequestCreateSceneExpressionAlterationRequest {
    private CreateSceneAlterationRequest createSceneAlterationRequest;
    private CreateSceneExpressionAlterationRequest createSceneExpressionAlterationRequest;

    public OneOfCreateSceneAlterationRequestCreateSceneExpressionAlterationRequest(CreateSceneAlterationRequest createSceneAlterationRequest) {
        this.createSceneAlterationRequest = createSceneAlterationRequest;
    }

    public OneOfCreateSceneAlterationRequestCreateSceneExpressionAlterationRequest(CreateSceneExpressionAlterationRequest createSceneExpressionAlterationRequest) {
        this.createSceneExpressionAlterationRequest = createSceneExpressionAlterationRequest;
    }

    public Object getData() {
        if (this.createSceneAlterationRequest != null) {
            return this.createSceneAlterationRequest;
        }
        if (this.createSceneExpressionAlterationRequest != null) {
            return this.createSceneExpressionAlterationRequest;
        }
        return null;
    }

    @Nullable
    public CreateSceneAlterationRequest getCreateSceneAlterationRequest() {
        return this.createSceneAlterationRequest;
    }

    @Nullable
    public CreateSceneExpressionAlterationRequest getCreateSceneExpressionAlterationRequest() {
        return this.createSceneExpressionAlterationRequest;
    }
}
