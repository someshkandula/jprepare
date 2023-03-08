package com.somesh.stream;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class StreamEx {

    public static void main(String[] str){
        PojoEx pojoEx1 = new PojoEx( "100","Somesh", null,false);
        PojoEx pojoEx2 = new PojoEx("101","Somesh1", "101",true);
        PojoEx pojoEx3 = new PojoEx("102","Somesh2","102",false);
        PojoEx pojoEx4 = new PojoEx("104","Somesh4","103",false);
        PojoEx pojoEx5 = new PojoEx("105","Somesh5","104",true);

        List<PojoEx> list = new ArrayList<>();
        list.add(pojoEx1);
        list.add(pojoEx2);
        list.add(pojoEx3);
        list.add(pojoEx4);
        list.add(pojoEx5);

        Stream<PojoEx> sj1 =  list.stream().filter (p -> p.isStatus ().equals (true));

        sj1.forEach (System.out::println);

        Stream<PojoEx> sj =  list.stream();
       // Map<String, List<PojoEx>> pojoMap =  sj.collect(groupingBy(PojoEx::getId, toList()));
       // System.out.println(pojoMap.size());

        Map<String, List<PojoEx>> pojoMap1 =  sj.limit(1).collect(groupingBy(PojoEx::getId, toList()));
        //Map<String, List<PojoEx>> pojoMap1 =  sj2.collect(Collectors.toMap(PojoEx::getId, toList()));
        System.out.println(pojoMap1.size());
        System.out.println (pojoMap1);
    }
}
 class PojoEx {
    String id;
    String name;
    String test;
    Boolean status;

     @Override
     public String toString() {
         return "PojoEx{" +
                 "id='" + id + '\'' +
                 ", name='" + name + '\'' +
                 ", test='" + test + '\'' +
                 ", status=" + status +
                 '}';
     }

     public PojoEx(String id, String name, String test, Boolean status) {
         this.id = id;
         this.name = name;
         this.test = test;
         this.status = status;
     }

     public String getTest() {
         return test;
     }

     public void setTest(String test) {
         this.test = test;
     }

     public Boolean isStatus() {
         return status;
     }

     public void setStatus(Boolean status) {
         this.status = status;
     }

     public String getId() {
         return id;
     }

     public void setId(String id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }
