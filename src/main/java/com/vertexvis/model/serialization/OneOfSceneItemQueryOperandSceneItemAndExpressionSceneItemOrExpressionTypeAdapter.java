package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.SceneItemAndExpression;
import com.vertexvis.model.SceneItemOrExpression;
import com.vertexvis.model.OneOfSceneItemQueryOperandSceneItemAndExpressionSceneItemOrExpression;

import java.io.IOException;
import java.util.function.Supplier;

public class OneOfSceneItemQueryOperandSceneItemAndExpressionSceneItemOrExpressionTypeAdapter extends TypeAdapter<OneOfSceneItemQueryOperandSceneItemAndExpressionSceneItemOrExpression> {

    private final Supplier<Gson> gsonSupplier;

    public OneOfSceneItemQueryOperandSceneItemAndExpressionSceneItemOrExpressionTypeAdapter(Supplier<Gson> gsonSupplier) {
        this.gsonSupplier = gsonSupplier;
    }

    @Override
    public void write(JsonWriter out, OneOfSceneItemQueryOperandSceneItemAndExpressionSceneItemOrExpression value) throws IOException {
        if (value.getSceneItemAndExpression() != null) {
            out.jsonValue(gsonSupplier.get().toJson(value.getSceneItemAndExpression()));
        } else if (value.getSceneItemOrExpression() != null) {
            out.jsonValue(gsonSupplier.get().toJson(value.getSceneItemOrExpression()));
        }
    }

    @Override
    public OneOfSceneItemQueryOperandSceneItemAndExpressionSceneItemOrExpression read(JsonReader in) throws IOException {
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
            if (type.equals("and")) {
                SceneItemAndExpression expression = gsonSupplier.get().fromJson(in, SceneItemAndExpression.class);
                return new OneOfSceneItemQueryOperandSceneItemAndExpressionSceneItemOrExpression(expression);
            } else if (type.equals("or")) {
                SceneItemOrExpression expression = gsonSupplier.get().fromJson(in, SceneItemOrExpression.class);
                return new OneOfSceneItemQueryOperandSceneItemAndExpressionSceneItemOrExpression(expression);
            }
        }
        return null;
    }
}
