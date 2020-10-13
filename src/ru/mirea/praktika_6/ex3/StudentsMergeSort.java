package ru.mirea.praktika_6.ex3;

import java.util.Comparator;

public class StudentsMergeSort implements Comparator<Student>
{
    public Student[] sortAndMergeArrays(Student[] list1, Student[] list2)
    {
        // Unite array into one super-array
        Student[] unsortedUnitedList = new Student[list1.length + list2.length];
        System.arraycopy(list1, 0, unsortedUnitedList, 0, list1.length);
        System.arraycopy(list2, 0, unsortedUnitedList, list1.length, list2.length);

        return sortArray(unsortedUnitedList);
    }

    private Student[] sortArray(Student[] list)
    {
        if (list == null)
        {
            return null;
        }

        if (list.length == 1)
        {
            return list;
        }

        // copy left part from start to middle
        Student[] bufferArray1 = new Student[list.length / 2];
        System.arraycopy(list, 0, bufferArray1, 0, list.length / 2);

        // copy right part from middle to end
        Student[] bufferArray2 = new Student[list.length - list.length / 2];// length of last part could be uneven
        System.arraycopy(list, list.length / 2, bufferArray2, 0,list.length - list.length / 2);

        // do recursion until the length of each part is equal 1
        bufferArray1 = sortArray(bufferArray1);
        bufferArray2 = sortArray(bufferArray2);

        // then recursive merge
        return mergeArrays(bufferArray1, bufferArray2);
    }

    private Student[] mergeArrays(Student[] list1, Student[] list2)
    {
        Student[] bufferArray = new Student[list1.length + list2.length];
        int position1 = 0;
        int position2 = 0;

        for(int i = 0; i < bufferArray.length; i++)
        {
            if(position1 == list1.length)
            {
                bufferArray[i] = list2[position2];
                position2++;
            }
            else if(position2 == list2.length)
            {
                bufferArray[i] = list1[position1];
                position1++;
            }
            else if(compare(list1[position1], list2[position2]) > 0)
            {
                bufferArray[i] = list2[position2];
                position2++;
            }
            else if(compare(list1[position1], list2[position2]) < 0)
            {
                bufferArray[i] = list1[position1];
                position1++;
            }
            else if(compare(list1[position1], list2[position2]) == 0)
            {
                bufferArray[i] = list1[position1];
                i++;
                bufferArray[i] = list2[position2];
                position1++;
                position2++;
            }
        }

        return bufferArray;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getId()) - (o2.getId());
    }
}
