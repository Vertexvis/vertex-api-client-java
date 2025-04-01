package com.vertexvis.model;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.vertexvis.JSON;

import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;

public class AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadataTest {

  @Test
  void serializesQueryById() {
    UUID id = UUID.randomUUID();

    AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata q =
        new AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata(new QueryById().data(
            new QueryByIdData().type(QueryByIdData.TypeEnum.QUERY_BY_ID).attributes(
                new QueryByIdDataAttributes().type(QueryByIdDataAttributes.TypeEnum.ID)
                    .value(id.toString()))));

    SceneOperation op = new SceneOperation().query(q);
    String expected =
        "{\"query\":{\"data\":{\"type\":\"query-by-id\",\"attributes\":{\"type\":\"id\",\"value\":\"" +
            id + "\"}}},\"operations\":[]}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesQueryByCollection() {
    UUID id = UUID.randomUUID();

    AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata q =
        new AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata(
            new QueryByCollection()
                .data(new QueryByCollectionData()
                    .type(QueryByCollectionData.TypeEnum.QUERY_BY_COLLECTION)
                    .attributes(new QueryByCollectionDataAttributes()
                        .type(QueryByCollectionDataAttributes.TypeEnum.OR)
                        .addValuesItem(new QueryById()
                            .data(new QueryByIdData()
                                .type(QueryByIdData.TypeEnum.QUERY_BY_ID)
                                .attributes(new QueryByIdDataAttributes()
                                    .type(QueryByIdDataAttributes.TypeEnum.ID)
                                    .value(id.toString())))))));

    SceneOperation op = new SceneOperation().query(q);
    String expected =
        "{\"query\":{\"data\":{\"type\":\"query-by-collection\",\"attributes\":{\"type\":\"or\",\"values\":[{\"data\":{\"type\":\"query-by-id\",\"attributes\":{\"type\":\"id\",\"value\":\"" +
            id + "\"}}}]}}},\"operations\":[]}";

    assertEquals(expected, new JSON().serialize(op));
  }

  @Test
  void serializesQueryByAll() {
    AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata q =
        new AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata(QueryAll.ALL);

    SceneOperation op = new SceneOperation().query(q);
    String expected = "{\"query\":\"all\",\"operations\":[]}";

    assertEquals(expected, new JSON().serialize(op));
  }

    @Test
    void serializesQueryByMetadata() {
        AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata q =
                new AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata(new QueryByMetadata()
                        .data(new QueryByMetadataData()
                                .type(QueryByMetadataData.TypeEnum.QUERY_BY_METADATA)
                                .attributes(new QueryByMetadataDataAttributes()
                                        .exactMatch(true)
                                        .keys(List.of("key1"))
                                        .filter("filter1")
                                )
                        )
                );

        SceneOperation op = new SceneOperation().query(q);
        String expected = "{\"query\":{\"data\":{\"type\":\"query-by-metadata\",\"attributes\":{\"exactMatch\":true,\"filter\":\"filter1\",\"keys\":[\"key1\"]}}},\"operations\":[]}";

        assertEquals(expected, new JSON().serialize(op));
    }
}


