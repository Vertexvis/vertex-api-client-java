package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.SelectFileById;
import com.vertexvis.model.SelectFileBySuppliedId;
import com.vertexvis.model.OneOfSelectFileByIdSelectFileBySuppliedId;

import java.io.IOException;
import java.util.function.Supplier;

public class OneOfSelectFileByIdSelectFileBySuppliedIdTypeAdapter extends TypeAdapter<OneOfSelectFileByIdSelectFileBySuppliedId> {

    private final Supplier<Gson> gsonSupplier;

    public OneOfSelectFileByIdSelectFileBySuppliedIdTypeAdapter(Supplier<Gson> gsonSupplier) {
        this.gsonSupplier = gsonSupplier;
    }

    @Override
    public void write(JsonWriter out, OneOfSelectFileByIdSelectFileBySuppliedId value) throws IOException {
        if (value.getSelectFileById() != null) {
            out.jsonValue(gsonSupplier.get().toJson(value.getSelectFileById()));
        } else if (value.getSelectFileBySuppliedId() != null) {
            out.jsonValue(gsonSupplier.get().toJson(value.getSelectFileBySuppliedId()));
        }
    }

    @Override
    public OneOfSelectFileByIdSelectFileBySuppliedId read(JsonReader in) throws IOException {
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
            if (type.equals("file-id")) {
                SelectFileById request = gsonSupplier.get().fromJson(in, SelectFileById.class);
                return new OneOfSelectFileByIdSelectFileBySuppliedId(request);
            } else if (type.equals("supplied-id")) {
                SelectFileBySuppliedId request = gsonSupplier.get().fromJson(in, SelectFileBySuppliedId.class);
                return new OneOfSelectFileByIdSelectFileBySuppliedId(request);
            }
        }
        return null;
    }
}
