package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.FileJobOperation;
import com.vertexvis.model.FileJobArchiveOperation;
import com.vertexvis.model.OneOfFileJobArchiveOperation;

import java.io.IOException;
import java.util.function.Supplier;

public class OneOfFileJobArchiveOperationTypeAdapter extends TypeAdapter<OneOfFileJobArchiveOperation> {

    private final Supplier<Gson> gsonSupplier;

    public OneOfFileJobArchiveOperationTypeAdapter(Supplier<Gson> gsonSupplier) {
        this.gsonSupplier = gsonSupplier;
    }

    @Override
    public void write(JsonWriter out, OneOfFileJobArchiveOperation value) throws IOException {
        if (value.getFileJobArchiveOperation() != null) {
            out.jsonValue(gsonSupplier.get().toJson(value.getFileJobArchiveOperation()));
        }
    }

    @Override
    public OneOfFileJobArchiveOperation read(JsonReader in) throws IOException {
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
            if (type.equals("file-job-archive")) {
                FileJobArchiveOperation operation = gsonSupplier.get().fromJson(in, FileJobArchiveOperation.class);
                return new OneOfFileJobArchiveOperation(operation);
            }
        }
        return null;
    }
}
