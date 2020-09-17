package ru.mirea.praktika_2.ex2;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball _ball1 = new Ball(11.7f, 12.3f);
        _ball1.move(1.2f, -4.3f);

        Ball _ball2 = new Ball();
        _ball2.setXY(3.0f, 22.0f);

        System.out.println(_ball1.toString());
        System.out.println(_ball2.toString());
    }
}
