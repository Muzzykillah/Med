package com.hospital;

public class Intern extends Person implements OperationSkills {

    public Intern(String name, int age) {
        super(name, age);
    }

    public boolean operationDifficulty(int percent) {
        if (percent > OperationSkills.OPERATION_SKILL) {
            System.out.println("Call another doctor.");
            return true;
        } else {
            System.out.println("You may begin. " + getName() + ", " +getAge());
            return false;
        }
    }
}


