package ru.mirea.praktika_5.ex5;

public class NumDigitsSum
{
    private int N;
    private int Sum;

    public NumDigitsSum(int n)
    {
        N = n;
        Sum = 0;
    }

    public int GetSum()
    {
        return Sum;
    }

    public void FindDigitsSum()
    {
        if (N == 0)
            return;

        Sum += N % 10;
        N /= 10;

        FindDigitsSum();
    }
}
