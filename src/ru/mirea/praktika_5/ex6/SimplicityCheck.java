package ru.mirea.praktika_5.ex6;

public class SimplicityCheck
{
    private int n;
    private int i;

    public SimplicityCheck(int n) {
        this.n = n;
        this.i = 2;
    }

    public String IsNumSimple()
    {
        int divider = (i * 2) - 1;
        if(divider == n)
            return "YES";

        if(n % 2 == 0 || n % divider == 0)
        {
            return "NO";
        }
        else
        {
            i++;
            return IsNumSimple();
        }
    }
}
