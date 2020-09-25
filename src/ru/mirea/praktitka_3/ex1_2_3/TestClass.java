package ru.mirea.praktitka_3.ex1_2_3;

public class TestClass {
    public static void main(String[] args) {
        Shape s1 = new Circle("RED", false, 5.5);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.isFilled());

        // Класс Shape не имеет медота getRadius()
        // Закастив Circle мы только указали на конкретную
        // реализацию абстрактных методов
        /* System.out.println(s1.getRadius()); */

        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Shape на то и абстрактый, чтобы не существовало
        // экзампляров данного класса
        /* Shape s2 = new Shape() */

        Shape s3 = new Rectangle("RED", false, 1.0, 2.0);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        // Причина аналогичная с getRadius
        /* System.out.println(s3.getLength); */

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        // Причина аналогичная с getRadius
        /* System.out.println(s4.getSide()); */

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        // Даже с учетом раскаста реализация абстрактых методов
        // "перезаписываться" не будет
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());

        // А всё, а мы уже раскастили Square до Rectangle
        /* System.out.println(r1.getSide()); */

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getLength());
        System.out.println(sq1.getSide());
    }
}