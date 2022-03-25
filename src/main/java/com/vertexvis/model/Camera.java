package com.vertexvis.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

// Created class for deserializing the OneOfOrthographicPerspective camera adapter.
public class Camera extends OrthographicCamera {
    public static final String SERIALIZED_NAME_POSITION = "position";
    @SerializedName(SERIALIZED_NAME_POSITION)
    private Vector3 position;
    public Camera position(Vector3 position) {

        this.position = position;
        return this;
    }

    /**
     * Get position
     * @return position
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Vector3 getPosition() {
        return position;
    }
}
