package ru.mirea.praktitka_3.ex1_2_3;

public class Square extends Rectangle {
    // В задании не сказано, что должно быть свойство side
    // поэтому в качестве данного свойства используется
    // свойство width из наследуемого класса Rectangle

    public Square() { }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square Area = " + this.getArea() + "Square Perimeter = " + this.getPerimeter();
    }
}
