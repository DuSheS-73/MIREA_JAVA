package ru.mirea.p1_dog;

import java.lang.*;

public class Dog
{
    private int age;
    private String name;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }

    public int getAge()
    {
        return this.age;
    }
    public String getName()
    {
        return this.name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return this.name + ", age " + this.age;
    }

    public void intoHumanAge()
    {
        System.out.println(name + "'s age in human years is " + age * 7 + " years");
    }
}
