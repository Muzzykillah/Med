package com.hospital;

public class Animal {
    private String name;
    private int legs;


    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }
    public String getName(){
        return "This is a " + name;
    }
    public String getLegs(){
        return "Animal has " +legs+" legs";
    }
}
