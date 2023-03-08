package com.somesh.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public class Decompress1 {

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        /*Holder holder = new Holder();
        holder.setOtherStuff("[OTHER STUFF]");
        holder.setBytes(new Bytes(new byte[]{1,2}, new byte[]{4,5},100, "Somesh"));

        String json = mapper.writeValueAsString(holder);*/
        String json = "{\"bytes\":{\"bytes\":\"AQI=\",\"rest\":\"BAU=\",\"testId\":100,\"name\":\"Somesh\"},\"otherStuff\":\"[OTHER STUFF]\"}";


        System.out.println(" Serializer : "+json);
        Holder deserialised = mapper.readValue(json, Holder.class);


        System.out.println(" deserialised "+Arrays.toString(deserialised.getBytes().getBytes()));
        System.out.println(" deserialised "+Arrays.toString(deserialised.getBytes().getRest ()));
        System.out.println(" deserialised "+deserialised.getBytes().getName ());
        System.out.println(" deserialised "+deserialised.getBytes().getTestId ());
    }

}

class Holder {
    private Bytes bytes;
    private String otherStuff;

    public Bytes getBytes() {
        return bytes;
    }

    public void setBytes(Bytes bytes) {
        this.bytes = bytes;
    }

    public String getOtherStuff() {
        return otherStuff;
    }

    public void setOtherStuff(String otherStuff) {
        this.otherStuff = otherStuff;
    }
}

//@JsonSerialize(using = BytesSerializer.class)
//@JsonDeserialize(using = BytesDeserializer.class)
class Bytes {
    private byte[] bytes;
    private byte[] rest;
    private int testId;
    private String name;

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public void setRest(byte[] rest) {
        this.rest = rest;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bytes() {

    }

    public Bytes(byte[] bytes, byte[] rest, int testId, String name) {
        this.bytes = bytes;
        this.rest = rest;
        this.testId = testId;
        this.name = name;
    }

    public byte[] getRest() {
        return rest;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }

    public byte[] getBytes() {
        return bytes;
    }
}

/*
class BytesDeserializer extends StdDeserializer<Bytes> {

    private static final long serialVersionUID = 1514703510863497028L;

    public BytesDeserializer() {
        super(Bytes.class);
    }

    @Override
    public Bytes deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        System.out.println (p.getCodec().readTree(p).size ());
        //System.out.println (p.getInputSource ().toString ());
        JsonNode node = p.getCodec().readTree(p);
        System.out.println ("node:"+node);
        //byte[] b = node.get (0);
        String base64 = node.asText();
        System.out.println ("base64:"+ base64);
        byte[] b = Base64.decode (base64);
        System.out.println ("b:"+new String(b));
        return null; //new Bytes(Base64.decode(base64));
    }
}

class BytesSerializer extends StdSerializer<Bytes> {

    private static final long serialVersionUID = -5510353102817291511L;

    public BytesSerializer() {
        super(Bytes.class);
    }

    @Override
    public void serialize(Bytes value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeString(Base64.encode(value.getBytes()));
    }
}*/
