package ru.mirea.praktika_6.ex2;

public class Source
{
    public static void main(String[] args)
    {
        int StudentsAmount = 120;
        Student[] students = new Student[StudentsAmount];

        // Заполняем массив рандомными значениями
        for(int i = 0; i < StudentsAmount; i++)
        {
            students[i] = new Student((int)(Math.random() * (100 - 10 + 1) + 10));
        }

        SortingStudentsByGPA ssbg = new SortingStudentsByGPA();
        ssbg.quickSort(students);

        for(var i : students)
            System.out.print(i.getRating() + " ");
    }
}
