package com.vertexvis.model;

import javax.annotation.Nullable;

public class OneOfSceneItemQueryOperandSceneItemAndExpressionSceneItemOrExpression {
    private SceneItemAndExpression sceneItemAndExpression;
    private SceneItemOrExpression sceneItemOrExpression;

    public OneOfSceneItemQueryOperandSceneItemAndExpressionSceneItemOrExpression(SceneItemAndExpression sceneItemAndExpression) {
        this.sceneItemAndExpression = sceneItemAndExpression;
    }

    public OneOfSceneItemQueryOperandSceneItemAndExpressionSceneItemOrExpression(SceneItemOrExpression sceneItemOrExpression) {
        this.sceneItemOrExpression = sceneItemOrExpression;
    }

    public Object getData() {
        if (this.sceneItemAndExpression != null) {
            return this.sceneItemAndExpression;
        }
        if (this.sceneItemOrExpression != null) {
            return this.sceneItemOrExpression;
        }
        return null;
    }

    @Nullable
    public SceneItemAndExpression getSceneItemAndExpression() {
        return this.sceneItemAndExpression;
    }

    @Nullable
    public SceneItemOrExpression getSceneItemOrExpression() {
        return this.sceneItemOrExpression;
    }
}