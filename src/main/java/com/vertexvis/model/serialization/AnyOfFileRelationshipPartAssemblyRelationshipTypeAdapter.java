package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.AnyOfFileRelationshipPartAssemblyRelationship;
import com.vertexvis.model.AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType;
import com.vertexvis.model.FileRelationship;
import com.vertexvis.model.FileRelationshipData;
import com.vertexvis.model.PartAssemblyRelationship;
import com.vertexvis.model.PartAssemblyRelationshipData;
import com.vertexvis.model.PartRevisionInstance;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Supplier;

public class AnyOfFileRelationshipPartAssemblyRelationshipTypeAdapter extends TypeAdapter<AnyOfFileRelationshipPartAssemblyRelationship> {

    private final Supplier<Gson> gsonSupplier;

    public AnyOfFileRelationshipPartAssemblyRelationshipTypeAdapter(Supplier<Gson> gsonSupplier) {
        this.gsonSupplier = gsonSupplier;
    }

    @Override
    public void write(JsonWriter out, AnyOfFileRelationshipPartAssemblyRelationship value) throws IOException {
        if (value.getFileRelationship() != null) {
            out.jsonValue(gsonSupplier.get().toJson(value.getFileRelationship()));
        } else {
            out.jsonValue(gsonSupplier.get().toJson(value.getPartAssemblyRelationship()));
        }
    }

    @Override
    public AnyOfFileRelationshipPartAssemblyRelationship read(JsonReader in) throws IOException {
        Optional<AnyOfFileRelationshipPartAssemblyRelationship> anyof = Optional.empty();
        List<PartRevisionInstance> partRevisionInstances = new ArrayList<>();
        Map<String, AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType> metadataStringTypeMetadataFloatTypeMetadataNullTypes = new HashMap<>();
        PartAssemblyRelationship partAssemblyRelationship;
        FileRelationship fileRelationship;
        FileRelationshipData.TypeEnum typeEnum = null;
        UUID fileId = null;
        boolean isPartAssemblyRelationship = false;
        in.beginObject();
        while (in.hasNext()) {
            switch (in.nextName()) {
                case "data":
                    in.beginObject();
                    break;
                case "children":
                    isPartAssemblyRelationship = true;
                    Type listOfMyClassObject = new TypeToken<List<PartRevisionInstance>>() {
                    }.getType();
                    partRevisionInstances = gsonSupplier.get().fromJson(in, listOfMyClassObject);
                    break;
                case "type":
                    var type = in.nextString();
                    typeEnum = FileRelationshipData.TypeEnum.fromValue(type);
                    break;
                case "id":
                    fileId = UUID.fromString(in.nextString());
                    break;
                case "metadata":
                    Type goingToFail = new TypeToken<Map<String, AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType>>() {
                    }.getType();
                    try {
                        metadataStringTypeMetadataFloatTypeMetadataNullTypes = gsonSupplier.get().fromJson(in, goingToFail);
                    } catch (Exception e) {
                        if (in.peek() != JsonToken.END_ARRAY) {
                            in.endArray();
                        }

                    }
                    break;
            }
        }
        in.endObject();
        in.endObject();
        if (isPartAssemblyRelationship) {
            return new AnyOfFileRelationshipPartAssemblyRelationship(new PartAssemblyRelationship()
                    .data(new PartAssemblyRelationshipData()
                            .children(partRevisionInstances).metadata(metadataStringTypeMetadataFloatTypeMetadataNullTypes)));
        } else {
            return new AnyOfFileRelationshipPartAssemblyRelationship(new FileRelationship()
                    .data(new FileRelationshipData()
                            .type(typeEnum).id(fileId)));
        }
    }
}
