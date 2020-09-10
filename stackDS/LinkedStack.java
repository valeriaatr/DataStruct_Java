/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 * Represents a linked implementation of a stack.
 
 */
 public class LinkedStack<T> implements StackADT<T> {
    /* Declare two instance variables:
       1. count - an integer which represents the number of items on the stack
       2. top - a reference to the top of the stack, of type LinearNode
    */
     private int count;
     private LinearNode top;
    /**
     * Constructor: Creates an empty stack.
     */
    public LinkedStack() {
        /* Initialize the instance variables appropriately.
        */
        count = 0;
        top = null;
        LinearNode<T> stack = null;
 
    }

    /**
     * Adds the specified element to the top of this stack.
     * @param element element to be pushed on stack
     */
    public void push(T element) {
        LinearNode<T> newNode = new LinearNode<T>(element);
        newNode.setNext(element);//do not cast!
        this.stack = newNode;
        count++;

        /* Push the newNode onto the top of the stack.
           Be sure to update top and count.
        */
    
    }

    /**
     * Removes the element at the top of this stack and returns a
     * reference to it. 
     * @return element from top of stack
     * @throws EmptyCollectionException if the stack is empty
     */
    public T pop() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("stack");
        T result = stack[top];
        stack[top]=null;
        
        count--;
        return result;
        /* Remove and return the element that is on top of the stack.
        */
 
    }
   
    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.  
     * @return element on top of stack
     * @throws EmptyCollectionException if the stack is empty  
     */
    public T peek() throws EmptyCollectionException {
        /* Similar to pop, but don't take the element of the stop, just return it.
        */
      
    }

    /**
     * Returns true if this stack is empty and false otherwise. 
     * @return true if stack is empty
     */
    public boolean isEmpty() {
        /* complete the code here:
        */
     
    }
 
    /**
     * Returns the number of elements in this stack.
     * @return number of elements in the stack
     */
    public int size() {
        /* complete the code here:
        */
      
    }

    /**
     * Returns a string representation of this stack. 
     * @return string representation of the stack
     * This method has been done for you!
     */
    public String toString() {
        String result = "";
        LinearNode current = top;

        while (current != null) {
            result = result + current.getData() + "\n";
            current = current.getNext();
        }

        return result;
    }
}
