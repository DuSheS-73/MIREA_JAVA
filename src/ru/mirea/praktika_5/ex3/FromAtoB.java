package ru.mirea.praktika_5.ex3;

public class FromAtoB
{
    private int A;
    private int B;

    public FromAtoB(int a, int b)
    {
        A = a;
        B = b;
    }

    public void PrintFromAtoB()
    {
        System.out.print(A + " ");

        if(A < B)
            A++;
        else if (A > B)
            A--;
        else
            return;

        PrintFromAtoB();
    }
}
