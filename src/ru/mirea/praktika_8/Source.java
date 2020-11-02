package ru.mirea.praktika_8;

public class Source
{
    public static void main(String[] args) {
        UnfairWaitList<Integer> list = new UnfairWaitList<>();
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);
        list.addElement(5);

        System.out.print(list.toString());
        System.out.println();

        list.moveToBack(1);

        System.out.print(list.toString());
    }
}
