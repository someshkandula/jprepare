package com.somesh.coldstreamselect;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import java.io.IOException;

class BytesDeserializer extends StdDeserializer<CompressedDatapoint> {

    private static final long serialVersionUID = 1514703510863497028L;

    public BytesDeserializer() {
        super(CompressedDatapoint.class);
    }

    @Override
    public CompressedDatapoint deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode node = p.getCodec().readTree(p);
        String base64 = node.asText();
        return null; //new CompressedDatapoint(Base64.decode(base64));
    }
}