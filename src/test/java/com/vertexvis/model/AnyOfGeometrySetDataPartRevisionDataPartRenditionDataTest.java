package com.vertexvis.model;

import com.google.gson.reflect.TypeToken;
import com.vertexvis.JSON;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AnyOfGeometrySetDataPartRevisionDataPartRenditionDataTest
{
    @Test
    public void deserializesIncludedPartRevision() {
        var s = "{\"data\":{\"type\":\"queued-translation-job\",\"id\":\"fcd6ab7e-a0d2-4803-bd60-ba0950ca42a3\",\"attributes\":{\"status\":\"complete\",\"created\":\"2024-12-05T14:36:42.079684Z\",\"completed\":\"2024-12-05T14:36:44.814141Z\"},\"relationships\":{\"partRevision\":{\"data\":{\"type\":\"part-revision\",\"id\":\"ca3b2213-a0ac-43fe-bd9b-9ac74f0c847f\"}}}},\"included\":[{\"type\":\"part-revision\",\"id\":\"ca3b2213-a0ac-43fe-bd9b-9ac74f0c847f\",\"attributes\":{\"created\":\"2024-12-05T14:36:44.794028Z\",\"suppliedId\":\"33000058/A-test28\",\"name\":\"33000058/A;1-spool\"},\"relationships\":{\"geometrySet\":{\"type\":\"geometry-set\",\"id\":\"2b4f26fa-ef4b-4c81-a688-b513be54f4bf\"},\"part\":{\"type\":\"part\",\"id\":\"bb7537e9-57d9-49db-aa43-feb974f5ec46\"},\"defaultPartRendition\":{\"data\":{\"type\":\"part-rendition\",\"id\":\"1580b1f2-8bca-472c-95c5-964938a45048\"}}}}]}";
        var j = new JSON();
        var d = (QueuedTranslationJob)j.deserialize(s, new TypeToken<QueuedTranslationJob>(){}.getType());

        assertEquals(1, d.getIncluded().size());
        var i = d.getIncluded().get(0);
        assertFalse(i.isPartRenditionData());
        assertTrue(i.isPartRevisionData());
        assertFalse(i.isGeometrySetData());
        var r = i.getPartRevisionData().getRelationships();
        assertNotNull(r.getGeometrySet());
        assertNotNull(r.getPart());
        assertNotNull(r.getDefaultPartRendition());
        assertEquals(UUID.fromString("bb7537e9-57d9-49db-aa43-feb974f5ec46"), r.getPart().getId());
    }

    @Test
    public void deserializesIncludedPartRendition() {
        var s = "{\"data\":{\"type\":\"queued-translation-job\",\"id\":\"17c24737-c4f7-4476-afe2-4b6aa99210d6\",\"attributes\":{\"status\":\"complete\",\"created\":\"2024-12-05T21:07:12.925485Z\",\"completed\":\"2024-12-05T21:07:15.707787Z\"},\"relationships\":{\"partRendition\":{\"data\":{\"type\":\"part-rendition\",\"id\":\"0977d14d-e9b5-4463-ba4b-5018b7ca0478\"}}}},\"included\":[{\"type\":\"part-rendition\",\"id\":\"0977d14d-e9b5-4463-ba4b-5018b7ca0478\",\"attributes\":{\"created\":\"2024-12-05T21:07:15.669542Z\",\"suppliedId\":\"block_re_1\",\"name\":\"block_re\"},\"relationships\":{\"geometrySet\":{\"type\":\"geometry-set\",\"id\":\"fe7657bf-0c27-4aef-a0a1-0ce749ea1c56\"},\"partRevision\":{\"data\":{\"type\":\"part-revision\",\"id\":\"8671279d-a28e-4ac1-b0cf-5a73d53ca646\"}}}}]}";
        var j = new JSON();
        var d = (QueuedTranslationJob)j.deserialize(s, new TypeToken<QueuedTranslationJob>(){}.getType());

        assertEquals(1, d.getIncluded().size());
        var i = d.getIncluded().get(0);
        assertTrue(i.isPartRenditionData());
        assertFalse(i.isPartRevisionData());
        assertFalse(i.isGeometrySetData());
        var r = i.getPartRenditionData().getRelationships();
        assertNotNull(r.getGeometrySet());
        assertNotNull(r.getPartRevision());
        assertEquals(UUID.fromString("8671279d-a28e-4ac1-b0cf-5a73d53ca646"), r.getPartRevision().getData().getId());
    }

    @Test
    public void deserializedIncludedGeometrySet() {
        var s = "{\"data\":{\"type\":\"queued-translation-job\",\"id\":\"a60bd7eb-b0be-4d2b-b16a-9e15fc71cb4c\",\"attributes\":{\"status\":\"complete\",\"created\":\"2024-12-05T21:14:17.790431Z\",\"completed\":\"2024-12-05T21:14:20.863382Z\"},\"relationships\":{\"geometrySet\":{\"data\":{\"type\":\"geometry-set\",\"id\":\"df9a193c-d518-46b7-8a20-f4e204c51b3b\"}}}},\"included\":[{\"type\":\"geometry-set\",\"id\":\"df9a193c-d518-46b7-8a20-f4e204c51b3b\",\"attributes\":{\"created\":\"2024-12-05T21:14:20.573297Z\"}}]}";
        var j = new JSON();
        var d = (QueuedTranslationJob)j.deserialize(s, new TypeToken<QueuedTranslationJob>(){}.getType());

        assertEquals(1, d.getIncluded().size());
        var i = d.getIncluded().get(0);
        assertFalse(i.isPartRenditionData());
        assertFalse(i.isPartRevisionData());
        assertTrue(i.isGeometrySetData());
        var r = i.getGeometrySetData();
        assertEquals(UUID.fromString("df9a193c-d518-46b7-8a20-f4e204c51b3b"), r.getId());
    }
}
