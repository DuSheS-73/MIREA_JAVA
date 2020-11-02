package ru.mirea.praktika_8;

public class UnfairWaitList<E> extends WaitList<E>
{
    public UnfairWaitList() {
        super();
    }

    public void remove(E element)
    {
        if(!this.content.peekFirst().equals(element))
        {
            this.content.remove(element);
        }
    }

    public void moveToBack(E element)
    {
        if(this.content.peekFirst().equals(element)) {
            this.content.offer(this.content.poll());
        }
    }
}
