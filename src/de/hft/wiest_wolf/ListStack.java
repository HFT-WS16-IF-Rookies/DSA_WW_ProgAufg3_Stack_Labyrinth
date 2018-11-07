package de.hft.wiest_wolf;

import java.util.LinkedList;

/**
 *
 * @author Lukas Wiest
 */
public class ListStack extends stack.Stack
{
    LinkedList<Object> stack = new LinkedList<>();

    @Override
    public String version()
    {
        return "Version 1.b - Stack; Implementierung als verkettete Liste mit Exception-Handling";
    }

    @Override
    public void empty()
    {
        stack.clear();
    }

    @Override
    public void push(Object element)
    {
        stack.addLast(element);
    }

    @Override
    public Object pop()
    {
        Object toReturn = this.peek();
        stack.removeLast();
        return toReturn;
    }

    @Override
    public int size()
    {
        return stack.size();
    }

    @Override
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    @Override
    public boolean isFull()
    {
        return false;
    }

    @Override
    public Object peek()
    {
        return stack.getLast();
    }

    @Override
    public String toString()
    {
        StringBuilder buf = new StringBuilder();
        for (int i=0; i<stack.size()-1; i++)
        {
            buf.append(stack.get(i).toString());
            buf.append(" ");
        }
        buf.append("[");
        buf.append(stack.getLast().toString());
        buf.append("]");
        return buf.toString();
    }

}
