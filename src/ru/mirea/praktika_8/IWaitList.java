package ru.mirea.praktika_8;

import java.util.Collection;

public interface IWaitList<E>
{
    void addElement(E element);
    E remove();
    boolean contains(E element);
    boolean containsAll(Collection<E> c);
    boolean isEmpty();
}
