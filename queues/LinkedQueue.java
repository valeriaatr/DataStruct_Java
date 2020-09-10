/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author C0443852
 * @param <T>
 */
public class LinkedQueue<T> implements QueueADT<T> {
    private int count;
    private LinearNode<T> head, tail;

    /**
     * Creates an empty queue.
     */
    public LinkedQueue(){    
        /* There is a logic error in this method.
           Hint: One line of code is missing.
        */
        count = 0;
        head = tail = null;
    }

    /**
     * Adds the specified element to the tail of this queue.
     * @param element the element to be added to the tail of the queue
     */
    public void enqueue(T element){    
        /* There is a logic error in this method.
           Hint: some code is missing.
        */
        LinearNode<T> node = new LinearNode<T>(element);
        if (isEmpty())
            head = node;
        else
            tail.setNext(node);
        tail = node; //make tail a reference to this node now
        tail.setNext(null);
        
    }

    /**
     * Removes the element at the head of this queue and returns a
     * reference to it. 
     * @return the element at the head of this queue
     * @throws EmptyCollectionException if the queue is empty
     */
    public T dequeue() throws EmptyCollectionException {
        /* There is a logic error in this method.
           Hint: Some code is missing.
        */
        if (isEmpty())
            throw new EmptyCollectionException("queue");

        T result = head.getData();

        if (isEmpty())
            tail = null;

        return result;
    }
   
    /**
     * Returns a reference to the element at the head of this queue.
     * The element is not removed from the queue.  
     * @return a reference to the first element in this queue
     * @throws EmptyCollectionsException if the queue is empty
     */
    public T first() throws EmptyCollectionException {
        return(head.getData());
    }

    /**
     * Returns true if this queue is empty and false otherwise. 
     * @return true if this queue is empty 
     */
    public boolean isEmpty() {
        /* There is a logic error in this method.
           Hint: Check the boolean expression that is returned.
        */
        return(head == null);
    }
 
    /**
     * Returns the number of elements currently in this queue.
     * @return the number of elements in the queue
     */
    public int size() {
        return(count);
    }

    /**
     * Returns a string representation of this queue. 
     * @return the string representation of the queue
     */
    @Override
    public String toString(T element) { //logic error here
        LinearNode<T> current = head;
        String toReturn = "";
        
        if (current == null)
            return("No data");
        else
            while (current != null)
                toReturn = toReturn + ", " + current.getData().toString();
            
        return(toReturn);
                
    }
}