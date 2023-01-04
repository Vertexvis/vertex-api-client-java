package com.vertexvis.model;

import com.google.gson.reflect.TypeToken;
import com.vertexvis.JSON;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnyOfFileRelationshipPartAssemblyRelationshipTest {
    private static List<PartRevisionInstance> createPartRevisionInstances(List<UUID> ids) {
        int num = ids.size();
        return IntStream.range(0, num)
                .mapToObj(ordinal -> new PartRevisionInstance().
                        ordinal(ordinal)
                        .referenceId(ids.get(ordinal))
                        .transform(new Matrix4()))
                .collect(Collectors.toList());
    }

    @Test
    void serializesAnyOfFileRelationshipPartAssemblyRelationships() {
        UUID id = UUID.randomUUID();
        AnyOfFileRelationshipPartAssemblyRelationship rel =
                new AnyOfFileRelationshipPartAssemblyRelationship(
                        new PartAssemblyRelationship()
                                .data(new PartAssemblyRelationshipData()
                                        .metadata(Collections.emptyList())
                                        .children(createPartRevisionInstances(Collections.singletonList(id)))
                                ));

        CreatePartRequestDataRelationships reqData =
                new CreatePartRequestDataRelationships().source(rel);
        CreatePartRequest request = new CreatePartRequest().data(new CreatePartRequestData().type("assembly")
                .attributes(new CreatePartRequestDataAttributes().name("test").suppliedId("testid").suppliedRevisionId("testRevisionId").metadata(Collections.emptyMap()))
                .relationships(reqData));

        String expectedData = "{\"source\":{\"data\":{\"children\":[{\"ordinal\":0,\"referenceId\":\"" + id + "\",\"transform\":{}}],\"metadata\":[]}}}";
        String expectedRequest = "{\"data\":{\"type\":\"assembly\",\"attributes\":{\"suppliedId\":\"testid\",\"suppliedRevisionId\":\"testRevisionId\",\"metadata\":{},\"name\":\"test\"},\"relationships\":{\"source\":{\"data\":{\"children\":[{\"ordinal\":0,\"referenceId\":\"" + id + "\",\"transform\":{}}],\"metadata\":[]}}}}}";

        assertEquals(expectedData, new JSON().serialize(reqData));
        assertEquals(expectedRequest, new JSON().serialize(request));
    }

    @Test
    void deserializeAnyOfFileRelationshipPartAssemblyRelationships() {
        UUID id = UUID.randomUUID();

        String relationshipsPayload = "{\"source\":{\"data\":{\"children\":[{\"ordinal\":0,\"referenceId\":\"" + id + "\",\"transform\":{}}],\"metadata\":[]}}}";
        String requestWithAssemblyRelationshipPayload = //"{\"data\":{\"type\":\"assembly\",\"attributes\":{\"suppliedId\":\"my-assembly-9cc7f76a-c719-4985-a460-04e2ec085a55\",\"suppliedRevisionId\":\"my-part-rev-9cc7f76a-c719-4985-a460-04e2ec085a55\",\"name\":\"gbiv-assemblyee3e3aef-caa1-4739-aada-d11ac0392e38\"},\"relationships\":{\"source\":{\"data\":{\"children\":[{\"ordinal\":0,\"referenceId\":\"4b2bb5e2-c8fe-4307-9f09-638dbbbf4bb7\",\"transform\":{}},{\"ordinal\":1,\"referenceId\":\"d927b4e5-54a0-4fed-8867-36811cc822c0\",\"transform\":{}},{\"ordinal\":2,\"referenceId\":\"54714ba5-6ac7-4b0b-968a-daa5e63e986f\",\"transform\":{}}],\"metadata\":[]}}}}}";
                "{\"data\":{\"type\":\"assembly\",\"attributes\":{\"suppliedId\":\"testid\",\"suppliedRevisionId\":\"testRevisionId\",\"metadata\":{},\"name\":\"test\"},\"relationships\":{\"source\":{\"data\":{\"children\":[{\"ordinal\":0,\"referenceId\":\"" + id + "\",\"transform\":{}}],\"metadata\":[]}}}}}";

        CreatePartRequestDataRelationships requestDataRelationships = new JSON()
                .deserialize(relationshipsPayload, TypeToken.get(CreatePartRequestDataRelationships.class).getType());
        CreatePartRequest request = new JSON().deserialize(requestWithAssemblyRelationshipPayload, TypeToken.get(CreatePartRequest.class).getType());
        PartAssemblyRelationshipData expected =
                new PartAssemblyRelationshipData()
                        .metadata(Collections.emptyList())
                        .children(createPartRevisionInstances(Collections.singletonList(id)));

        assertEquals(requestDataRelationships.getSource().getPartAssemblyRelationship().getData().getChildren().size(), 1);
        assertEquals(requestDataRelationships.getSource().getPartAssemblyRelationship().getData(), expected);
        assertEquals(request.getData().getRelationships().getSource().getPartAssemblyRelationship(), requestDataRelationships.getSource().getPartAssemblyRelationship());
    }
}
