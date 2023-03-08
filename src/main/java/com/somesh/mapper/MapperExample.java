package com.somesh.mapper;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.prefs.BackingStoreException;

public class MapperExample {

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println ("Mapper example !");
        String hello = "Hello World!";
        byte[] test = hello.getBytes();
        System.out.println ("byte array "+test);

        String string1 = new String(test);
        System.out.println(string1);

        //String javaStr = "{\"id\":101,\"interval\":\""+test+"\""+"}";
        String javaStr = "{\"id\":101,\"interval\":\"AAA+gAAAAB4=\"}";

        String string = new String("AAA+gAAAAB4=".getBytes(StandardCharsets.UTF_8));
        System.out.println(" String value "+ string);

        System.out.println (javaStr);
        ObjectMapper mapper = new ObjectMapper ();
        mapper.setBase64Variant (Base64Variants.MIME);

        Student s = mapper.readValue(javaStr, Student.class);

        System.out.println(s);

        System.out.println (s.getInterval ().length);




    }
}

class Student {
    int id;
    byte[] interval;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getInterval() {
        return interval;
    }

    public void setInterval(byte[] interval) {
        this.interval = interval;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", interval=" + Arrays.toString (interval) +
                '}';
    }
}