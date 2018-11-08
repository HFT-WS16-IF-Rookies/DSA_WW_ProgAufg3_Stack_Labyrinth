package de.hft.wiest_wolf;

import stack.StackEmptyException;
import stack.StackFullException;

/**
 *
 * @author Erik Wolf
 */
public class ArrayStack extends stack.Stack
{
	private Object[] stack = new Object[50];
	int top = 0;

    @Override
    public String version()
    {
    	return "Aufgabe 1.a - Stack; Implementierung als Array mit Exception-Handling";
    }

    @Override
    public void empty()
    {
    	stack = new Object [50];
        top = 0;
    }

    @Override
    public void push(Object element) throws StackFullException
    {
    	if(top >= stack.length)
    		throw new StackFullException();
		stack[top++] = element;
    }

    @Override
    public Object pop() throws StackEmptyException
    {
    	if(top < 1)
    		throw new StackEmptyException();
		Object tmp= stack[--top];
		stack[top] = null;
		return tmp;
    }

    @Override
    public int size()
    {
    	return top;
    }

    @Override
    public boolean isEmpty()
    {
    	if(top>0)
    		return false;
    	return true;
    }

    @Override
    public boolean isFull()
    {
    	if(top >= stack.length)
    		return true;
    	return false;
    }

    @Override
    public Object peek() throws StackEmptyException
    {
    	if(top < 1)
    		throw new StackEmptyException();
    	return stack[top-1];
    }

    @Override
    public String toString()
    {
    	String tmp = "";
    	for(int i = 0; i < top-1; i++)
    	{
    		tmp += stack[i] + " ";
    	}
    	tmp +="["+stack[top - 1] + "]";
    	return tmp;
    }
    
}
