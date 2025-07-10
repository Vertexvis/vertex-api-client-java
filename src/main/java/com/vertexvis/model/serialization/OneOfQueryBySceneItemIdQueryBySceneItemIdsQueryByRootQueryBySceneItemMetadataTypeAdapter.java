package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.QueryBySceneItemId;
import com.vertexvis.model.QueryBySceneItemIds;
import com.vertexvis.model.QueryByRoot;
import com.vertexvis.model.QueryBySceneItemMetadata;
import com.vertexvis.model.OneOfQueryBySceneItemIdQueryBySceneItemIdsQueryByRootQueryBySceneItemMetadata;

import java.io.IOException;
import java.util.function.Supplier;

public class OneOfQueryBySceneItemIdQueryBySceneItemIdsQueryByRootQueryBySceneItemMetadataTypeAdapter extends TypeAdapter<OneOfQueryBySceneItemIdQueryBySceneItemIdsQueryByRootQueryBySceneItemMetadata> {

    private final Supplier<Gson> gsonSupplier;

    public OneOfQueryBySceneItemIdQueryBySceneItemIdsQueryByRootQueryBySceneItemMetadataTypeAdapter(Supplier<Gson> gsonSupplier) {
        this.gsonSupplier = gsonSupplier;
    }

    @Override
    public void write(JsonWriter out, OneOfQueryBySceneItemIdQueryBySceneItemIdsQueryByRootQueryBySceneItemMetadata value) throws IOException {
        if (value.getQueryBySceneItemId() != null) {
            out.jsonValue(gsonSupplier.get().toJson(value.getQueryBySceneItemId()));
        } else if (value.getQueryBySceneItemIds() != null) {
            out.jsonValue(gsonSupplier.get().toJson(value.getQueryBySceneItemIds()));
        } else if (value.getQueryByRoot() != null) {
            out.jsonValue(gsonSupplier.get().toJson(value.getQueryByRoot()));
        } else if (value.getQueryBySceneItemMetadata() != null) {
            out.jsonValue(gsonSupplier.get().toJson(value.getQueryBySceneItemMetadata()));
        }
    }

    @Override
    public OneOfQueryBySceneItemIdQueryBySceneItemIdsQueryByRootQueryBySceneItemMetadata read(JsonReader in) throws IOException {
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
            switch (type) {
                case "scene-item-id":
                    QueryBySceneItemId request = gsonSupplier.get().fromJson(in, QueryBySceneItemId.class);
                    return new OneOfQueryBySceneItemIdQueryBySceneItemIdsQueryByRootQueryBySceneItemMetadata(request);
                case "scene-item-ids":
                    QueryBySceneItemIds request2 = gsonSupplier.get().fromJson(in, QueryBySceneItemIds.class);
                    return new OneOfQueryBySceneItemIdQueryBySceneItemIdsQueryByRootQueryBySceneItemMetadata(request2);
                case "root":
                    QueryByRoot request3 = gsonSupplier.get().fromJson(in, QueryByRoot.class);
                    return new OneOfQueryBySceneItemIdQueryBySceneItemIdsQueryByRootQueryBySceneItemMetadata(request3);
                case "scene-item-metadata":
                    QueryBySceneItemMetadata request4 = gsonSupplier.get().fromJson(in, QueryBySceneItemMetadata.class);
                    return new OneOfQueryBySceneItemIdQueryBySceneItemIdsQueryByRootQueryBySceneItemMetadata(request4);
            }
        }
        return null;
    }
}
