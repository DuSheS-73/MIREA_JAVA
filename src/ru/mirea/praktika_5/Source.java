package ru.mirea.praktika_5;

import ru.mirea.praktika_5.ex3.FromAtoB;
import ru.mirea.praktika_5.ex4.NumSum;
import ru.mirea.praktika_5.ex5.NumDigitsSum;
import ru.mirea.praktika_5.ex6.SimplicityCheck;

public class Source {
    public static void main(String[] args)
    {
        // TASK 3
        FromAtoB _exec_ex3 = new FromAtoB(3, 20);
        _exec_ex3.PrintFromAtoB();

        System.out.println();

        _exec_ex3 = new FromAtoB(20, 3);
        _exec_ex3.PrintFromAtoB();


        System.out.println();

        // TASK 4
        NumSum _exec_ex4 = new NumSum(2, 12);
        System.out.println(_exec_ex4.CountNumSumsEqualsD(2));

        // TASK 5
        NumDigitsSum _exec_ex5 = new NumDigitsSum(123);
        _exec_ex5.FindDigitsSum();
        System.out.println(_exec_ex5.GetSum());

        // TASK 6
        SimplicityCheck _exec_ex6 = new SimplicityCheck(11);
        System.out.println(_exec_ex6.IsNumSimple());






    }
}
