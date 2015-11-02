package ru.unn.agile.Stack.Model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {
    @Test
    public void Initiating_Stack_From_Int_Array() {
        Integer[] inputArray = {1, 2, 3};
        Stack myStack = new Stack(inputArray);
        assertEquals("1 2 3", myStack.toString());
    }

    @Test
     public void Initiating_Stack_From_String_Array() {
        String[] inputArray = {"one", "two", "three"};
        Stack myStack = new Stack(inputArray);
        assertEquals("one two three", myStack.toString());
    }

    @Test
    public void Initiating_Empty_Stack() {
        Stack myStack = new Stack();
        assertEquals("", myStack.toString());
    }

    @Test
    public void Push_Element_To_Empty_Stack() {
        Stack myStack = new Stack();
        Integer element = 1;
        myStack.push(element);
        assertEquals("1", myStack.toString());
    }

    @Test
    public void Push_10_Integer_Elements_To_Empty_Stack() {
        Stack myStack = new Stack();
        Integer[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < elements.length; ++i ) {
            myStack.push(elements[i]);
        }

        assertEquals("1 2 3 4 5 6 7 8 9 10", myStack.toString());
    }

    @Test
    public void Push_10_String_Elements_To_Empty_Stack() {
        Stack myStack = new Stack();
        String[] elements = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        for (int i = 0; i < elements.length; ++i ) {
            myStack.push(elements[i]);
        }

        assertEquals("1 2 3 4 5 6 7 8 9 10", myStack.toString());
    }
}
