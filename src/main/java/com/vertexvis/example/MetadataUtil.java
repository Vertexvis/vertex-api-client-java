package com.vertexvis.example;

import com.vertexvis.model.*;

import java.time.OffsetDateTime;
import java.util.AbstractMap;
import java.util.Map;
import java.util.UUID;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MetadataUtil {

    enum MetadataType {
        LONG,
        FLOAT,
        DATE,
        STRING,
        NULL
    }

    public static Map<String, AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType> createCustomMetadata(int numberOfMetadataProperties) {
        return IntStream.range(0, numberOfMetadataProperties).mapToObj(i -> {
            // generate key that index of the number of metadata properties
            var key = "key_0" + (i + 1) + "/" + numberOfMetadataProperties;
            var random = RandomGenerator.getDefault();
            var metadataType = random.nextInt(MetadataType.values().length);
            var value = switch (MetadataType.values()[metadataType]) {
                case LONG ->
                        new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                                new MetadataLongType().type("long").value(random.nextLong()));

                case FLOAT ->
                        new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                                new MetadataFloatType().type("float").value(random.nextFloat()));
                case DATE ->
                        new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                                new MetadataDateType().type("date").value(OffsetDateTime.now()));
                case STRING ->
                        new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                                new MetadataStringType().type("string").value(UUID.randomUUID().toString()));
                case NULL ->
                        new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                                new MetadataNullType().type("null"));

            };
            // return a map entry of key and value
            return new AbstractMap.SimpleEntry<>(key, value);

        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    }

}
