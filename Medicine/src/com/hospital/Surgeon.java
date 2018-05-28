package com.hospital;

public class Surgeon extends Person implements OperationSkills {

    public Surgeon(String name, int age) {
        super(name, age);
    }

    public boolean operationDifficulty(int percent) {
        System.out.println("You may begin. " + getName() + ", " +getAge());
        return false;
    }
}