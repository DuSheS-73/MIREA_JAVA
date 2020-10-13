package ru.mirea.praktika_6.ex2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>
{
    public void quickSort(Student[] students) {
        int startIndex = 0;
        int endIndex = students.length - 1;
        doSort(students, startIndex, endIndex);
    }

    private void doSort(Student[] students, int start, int end) {
        if (start >= end)
            return;

        int i = start;
        int j = end;
        int middle = i + (j - i) / 2;
        Student key = students[middle];

        while (i < j) {
            while (i < middle && compare(students[i], key) >= 0) {
                i++;
            }
            while (j > middle && compare(students[j], key) <= 0) {
                j--;
            }

            if (i < j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;

                if (i == middle)
                    middle = j;
                else if (j == middle)
                    middle = i;
            }
        }
        doSort(students, start, middle);
        doSort(students,middle+1, end);
    }

    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.getRating() - s2.getRating();
    }
}
