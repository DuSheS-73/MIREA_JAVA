package ru.mirea.praktika_6.ex3;

public class Source
{
    // Заполняем массив рандомными значениями
    private static void initializeList(Student[] list)
    {
        for(int i = 0; i < list.length; i++)
        {
            int id = (int)(Math.random() * (1000000 - 100000 + 1) + 100000);
            int rating = (int)(Math.random() * (100 - 5 + 1) + 5);
            list[i] = new Student(id, rating);
        }
    }

    public static void main(String[] args)
    {
        int firstListSize = 10;
        int secondListSize = 12;

        Student[] firstList = new Student[firstListSize];
        initializeList(firstList);
        Student[] secondList = new Student[secondListSize];
        initializeList(secondList);

        StudentsMergeSort sms = new StudentsMergeSort();
        Student[] unitedList = sms.sortAndMergeArrays(firstList, secondList);

        for(var i : unitedList)
            System.out.print(i.getId() + " ");
    }
}
