package de.hft.wiest_wolf;

import stack.Link;
import stack.StackEmptyException;

/**
 *
 * @author Lukas Wiest
 */
public class ListStack extends stack.Stack
{
    private Link current = null;

    @Override
    public String version()
    {
        return "Version 1.b - Stack; Implementierung als verkettete Liste mit Exception-Handling";
    }

    @Override
    public void empty()
    {
        current = null;
    }

    @Override
    public void push(Object element)
    {
        current = new Link(element, current);
    }

    @Override
    public Object pop() throws StackEmptyException
    {
        Object toReturn = peek();
        current = current.getNext();
        return toReturn;
    }

    @Override
    public int size()
    {
        if (current == null)
            return 0;
        else
            return current.getElement();
    }

    @Override
    public boolean isEmpty()
    {
        return (current == null);
    }

    @Override
    public boolean isFull()
    {
        return false;
    }

    @Override
    public Object peek() throws StackEmptyException
    {
        if (current == null)
            throw new StackEmptyException();

        return current.getData();
    }

    @Override
    public String toString()
    {
        if (isEmpty())
            return "";

        Object[] objArr = new Object[current.getElement()];
        StringBuilder buf = new StringBuilder();

        for (Link l=current; l != null; l=l.getNext())
            objArr[l.getElement()-1] = l.getData();

        for (int i=0; i<objArr.length-1; i++)
        {
            buf.append(objArr[i].toString());
            buf.append(" ");
        }
        buf.append("[");
        buf.append(objArr[objArr.length-1]);
        buf.append("]");
        return buf.toString();
    }

}
