package ru.mirea.praktika_6.ex3;

public class Student
{
    private int id;
    private int rating;

    public int getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public Student(int id, int rating) {
        this.id = id;
        this.rating = rating;
    }
}
