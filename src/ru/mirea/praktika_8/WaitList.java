package ru.mirea.praktika_8;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList<E> implements IWaitList<E>
{
    protected ConcurrentLinkedDeque<E> content;

    public WaitList() {
        this.content = new ConcurrentLinkedDeque<>();
    }

    public WaitList(Collection<E> collection) {
        this.content = new ConcurrentLinkedDeque<>(collection);
    }

    @Override
    public void addElement(E element)
    {
        this.content.offer(element);
    }

    @Override
    public E remove()
    {
        return this.content.remove();
    }

    @Override
    public boolean contains(E element)
    {
        for(E i : this.content)
        {
            if(i.equals(element))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<E> collection)
    {
        Iterator<E> iterator = collection.iterator();
        while(iterator.hasNext())
        {
            if(this.content.contains(iterator.next()) == false)
                return false;
        }
        return true;
    }

    @Override
    public boolean isEmpty()
    {
        return this.content.size() == 0;
    }

    @Override
    public String toString()
    {
        Iterator<E> iterator = this.content.iterator();
        StringBuilder str = new StringBuilder();

        while(iterator.hasNext()) {
            str.append(iterator.next().toString() + " ");
        }
        return str.toString();
    }
}
