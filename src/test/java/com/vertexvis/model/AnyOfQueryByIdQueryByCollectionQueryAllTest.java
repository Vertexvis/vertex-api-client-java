package com.vertexvis.model;

import com.vertexvis.JSON;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnyOfQueryByIdQueryByCollectionQueryAllTest {

    @Test
    void serializesQueryById() {
        UUID id = UUID.randomUUID();

        AnyOfQueryByIdQueryByCollectionQueryAll q =
                new AnyOfQueryByIdQueryByCollectionQueryAll(new QueryById().data(new QueryByIdData().type(QueryByIdData.TypeEnum.QUERY_BY_ID).attributes(new QueryByIdDataAttributes().type(QueryByIdDataAttributes.TypeEnum.ID).value(id.toString()))));

        SceneOperation op = new SceneOperation().query(q);
        String expected = "{\"query\":{\"data\":{\"type\":\"query-by-id\",\"attributes\":{\"type\":\"id\",\"value\":\"" + id + "\"}}},\"operations\":[]}";

        assertEquals(expected, new JSON().serialize(op));
    }

    @Test
    void serializesQueryByCollection() {
        UUID id = UUID.randomUUID();

        AnyOfQueryByIdQueryByCollectionQueryAll q =
                new AnyOfQueryByIdQueryByCollectionQueryAll(
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
        String expected = "{\"query\":{\"data\":{\"type\":\"query-by-collection\",\"attributes\":{\"type\":\"or\",\"values\":[{\"data\":{\"type\":\"query-by-id\",\"attributes\":{\"type\":\"id\",\"value\":\"" + id + "\"}}}]}}},\"operations\":[]}";

        assertEquals(expected, new JSON().serialize(op));
    }

    @Test
    void serializesQueryByAll() {
        AnyOfQueryByIdQueryByCollectionQueryAll q =
                new AnyOfQueryByIdQueryByCollectionQueryAll(QueryAll.ALL);

        SceneOperation op = new SceneOperation().query(q);
        String expected = "{\"query\":\"all\",\"operations\":[]}";

        assertEquals(expected, new JSON().serialize(op));
    }
}


