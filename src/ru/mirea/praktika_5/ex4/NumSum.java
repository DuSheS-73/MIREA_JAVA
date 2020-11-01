package ru.mirea.praktika_5.ex4;

public class NumSum
{
    // k - обозначает разрядность
    // s - предельное значение
    private int k;
    private int s;

    private int Counter;
    private int currentNum;
    private int MAX;
    private int MIN;

    public NumSum(int k, int s) {
        this.k = k;
        this.s = s;
        this.Counter = 0;

        MAX = (int)Math.pow(10, this.k);
        MIN = (int)Math.pow(10, this.k - 1);

        this.currentNum = MIN;
    }

    public int CountNumSumsEqualsD(int d)
    {
        if(s < MAX && s >= MIN)
        {
            if(currentNum == s)
                return Counter;

            int temp = currentNum;
            int tempSum = 0;

            while(temp != 0)
            {
                tempSum += temp % 10;
                temp /= 10;
            }

            if(tempSum == d)
                this.Counter++;

            currentNum++;
            return CountNumSumsEqualsD(d);
        }

        return 0;
    }
}
