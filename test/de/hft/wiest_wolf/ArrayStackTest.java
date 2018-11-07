package de.hft.wiest_wolf;

import static org.junit.Assert.*;
import org.junit.Test;

import stack.*;

/**
 *
 * @author Lukas Wiest
 */
public class ArrayStackTest
{
    @Test
    public void testVersion()
    {
        Stack instance = new ArrayStack();
        assertEquals(instance.version(), "Version 1.b - Stack; Implementierung als verkettete Liste mit Exception-Handling");
    }

    @Test
    public void testEmpty()
    {
        Stack instance = new ArrayStack();
        instance.push("ein Element");
        instance.empty();
        assert(instance.size() == 0);
    }

    @Test
    public void testPush()
    {
        Stack instance = new ArrayStack();
        String expected = "ein Element";
        instance.push(expected);
        assertEquals(expected, instance.peek());
    }

    @Test
    public void testPop()
    {
        Stack instance = new ArrayStack();
        String expected = "ein Element";
        instance.push(expected);
        assert(instance.size() == 1);
        assertEquals(expected, instance.pop());
        assert(instance.size() == 0);
    }

    @Test
    public void testSize()
    {
        Stack instance = new ArrayStack();
        instance.push("erstes Element");
        instance.push(15);
        instance.push("drittes Elemen");
        instance.pop();
        assert(instance.size() == 2);
    }

    @Test
    public void testIsEmpty()
    {
        Stack instance = new ArrayStack();
        assertTrue(instance.isEmpty());
    }

    @Test
    public void testIsFull()
    {
        Stack instance = new ArrayStack();
        assertFalse(instance.isFull());
    }

    @Test
    public void testPeek()
    {
        Stack instance = new ArrayStack();
        String expected = "ein Element";
        instance.push(expected);
        assertEquals(expected, instance.peek());
        assert(instance.size() == 1);
    }

    @Test
    public void testToString()
    {
        Stack instance = new ArrayStack();
        String first = "ein Element";
        String second = "nochmal";
        int third = 15;
        String fourth = "letztes";

        String expected = first + " " + second + " " + third + " [" + fourth + "]";

        instance.push(first);
        instance.push(second);
        instance.push(third);
        instance.push(fourth);

        assertEquals(expected, instance.toString());
    }
}
