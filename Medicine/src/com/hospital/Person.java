package com.hospital;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
    this.name=name;
    this.age=age;
}

    public String getName(){
        return "Doctor's name is " + name;
    }
    public String getAge(){
        return age+" years old";
            }
}
