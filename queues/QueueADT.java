/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author C0443852
 */
public interface QueueADT<T> {
     /**  
     * Adds one element to the rear of this queue. 
     * @param element  the element to be added to the rear of the queue  
     */
    public void enqueue (T element);
    

    /**  
     * Removes and returns the element at the front of this queue.
     * @return the element at the front of the queue
     */
    public T dequeue();
   

    /**  
     * Returns without removing the element at the front of this queue.
     * @return the first element in the queue
     */
    public T first();
   
    /**  
     * Returns true if this queue contains no elements.
     * @return true if this queue is empty
     */
    public boolean isEmpty();

    /**  
     * Returns the number of elements in this queue. 
     * @return the integer representation of the size of the queue
     */
    public int size();

    /**  
     * Returns a string representation of this queue. 
     * @return the string representation of the queue
     */
    public String toString(T element);
}
