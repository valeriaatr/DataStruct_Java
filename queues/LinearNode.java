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
public class LinearNode<T> {
    private LinearNode<T> next;
    private T data;
 
    /**
     * Creates an empty node.
     */
    public LinearNode() {
        next = null;
        data = null;
    }
 
    /**
     * Creates a node storing the specified data.
     * @param info data to be stored
     */
    public LinearNode(T info) {
        next = null;
        data = info;
    }
 
    /**
     * Returns the node that follows this one.
     * @return reference to next node
     */
    public LinearNode<T> getNext() {
        return next;
    }
 
    /**
     * Sets the node that follows this one.
     * @param node node to follow this one
     */
    public void setNext(LinearNode<T> node) {
        next = node;
    }
 
    /**
     * Returns the data stored in this node.
     * @return data stored at the node
     */
    public T getData() {
        return data;
    }
 
    /**
     * Sets the data stored in this node.
     * @param info data to be stored at this node
     */
    public void setData(T info) {
        data = info;
    }
    
}
