package ru.mirea.praktika_6.ex1;

public class TestStudent
{
    private static void InsertSort(Student[] students)
    {
        for (int i = 1; i < students.length; i++)
        {
            int j;
            Student buf = students[i];
            for (j = i - 1; j >= 0; j--)
            {
                if (students[j].getID() < buf.getID())
                    break;

                students[j + 1] = students[j];
            }
            students[j + 1] = buf;
        }
    }

    public static void main(String[] args)
    {
        int StudentsAmount = 120;
        Student[] students = new Student[StudentsAmount];

        // Заполняем массив рандомными значениями
        for(int i = 0; i < StudentsAmount; i++)
        {
            students[i] = new Student((int)(Math.random() * (1000000 - 100000 + 1) + 100000));
        }

        InsertSort(students);

        for (var i : students)
            System.out.print(i.getID() + " ");
    }
}
