package com.demo;

public class User {
    final String name;
    final int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + ": " + age;
    }
}
