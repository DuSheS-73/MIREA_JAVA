package ru.mirea.p2;

import java.lang.*;

public class Employee extends Person
{
    private int workingStage;

    public Employee(String name, int age, int workingStage)
    {
        super(name, age);
        this.workingStage = workingStage;
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee's name: " + this.getName()
                    + "\nAge: " + this.getAge()
                    + "\nWorking stage: " + this.workingStage);
    }
}
