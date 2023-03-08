package com.somesh.generic;

public class GenericClass <T> implements JavaGenericInterface <T>{

    T name;

    @Override
    public void setName(T name) {
        this.name = name;
    }

    @Override
    public T getName() {
        return name;
    }

    public static void main(String[] args) {
        GenericClass<String> user = new GenericClass<>();
        user.setName("Shaharyar Malik Lalani");
        System.out.println("My name is "+ user.getName());
    }
}