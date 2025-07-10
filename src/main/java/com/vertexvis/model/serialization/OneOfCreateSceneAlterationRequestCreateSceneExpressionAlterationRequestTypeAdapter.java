package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.CreateSceneAlterationRequest;
import com.vertexvis.model.CreateSceneExpressionAlterationRequest;
import com.vertexvis.model.OneOfCreateSceneAlterationRequestCreateSceneExpressionAlterationRequest;

import java.io.IOException;
import java.util.function.Supplier;

public class OneOfCreateSceneAlterationRequestCreateSceneExpressionAlterationRequestTypeAdapter extends TypeAdapter<OneOfCreateSceneAlterationRequestCreateSceneExpressionAlterationRequest> {

    private final Supplier<Gson> gsonSupplier;

    public OneOfCreateSceneAlterationRequestCreateSceneExpressionAlterationRequestTypeAdapter(Supplier<Gson> gsonSupplier) {
        this.gsonSupplier = gsonSupplier;
    }

    @Override
    public void write(JsonWriter out, OneOfCreateSceneAlterationRequestCreateSceneExpressionAlterationRequest value) throws IOException {
        if (value.getCreateSceneAlterationRequest() != null) {
            out.jsonValue(gsonSupplier.get().toJson(value.getCreateSceneAlterationRequest()));
        } else if (value.getCreateSceneExpressionAlterationRequest() != null) {
            out.jsonValue(gsonSupplier.get().toJson(value.getCreateSceneExpressionAlterationRequest()));
        }
    }

    @Override
    public OneOfCreateSceneAlterationRequestCreateSceneExpressionAlterationRequest read(JsonReader in) throws IOException {
        String type = null;
        in.beginObject();
        while (in.hasNext()) {
            String name = in.nextName();
            if ("type".equals(name)) {
                type = in.nextString();
                break;
            } else {
                in.skipValue();
            }
        }
        in.endObject();

        if (type != null) {
            if (type.equals("scene-alteration")) {
                CreateSceneAlterationRequest request = gsonSupplier.get().fromJson(in, CreateSceneAlterationRequest.class);
                return new OneOfCreateSceneAlterationRequestCreateSceneExpressionAlterationRequest(request);
            } else if (type.equals("scene-expression-alteration")) {
                CreateSceneExpressionAlterationRequest request = gsonSupplier.get().fromJson(in, CreateSceneExpressionAlterationRequest.class);
                return new OneOfCreateSceneAlterationRequestCreateSceneExpressionAlterationRequest(request);
            }
        }
        return null;
    }
}
