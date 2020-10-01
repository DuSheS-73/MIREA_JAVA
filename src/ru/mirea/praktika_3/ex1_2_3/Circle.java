package ru.mirea.praktitka_3.ex1_2_3;

public class Circle extends Shape {
    private double radius;

    public Circle() { }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius() {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "Circle Area = " + this.getArea() + "Circle Perimeter = " + this.getPerimeter();
    }

}
