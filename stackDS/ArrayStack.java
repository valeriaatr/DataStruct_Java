package Stack;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Stack;

/**
 * @author C0443852
 */
public class ArrayStack<T> implements StackADT<T> {
   
    private static int DEFAULT_CAPACITY=10;
    
    private int top;
    private T[] stack;
    
    
    public ArrayStack(int initialCapacity) {
        this.top =0;
        this.stack = (T[])(new Object[initialCapacity]);
    }
    
    public ArrayStack() {
       this(DEFAULT_CAPACITY);
    }


    public int size() {
        return top;
    }
    
    public void push(T element) {
            if (this.stack!=null && stack.length==DEFAULT_CAPACITY-1)
                expandCapacity();
            else {
                this.stack[top]=element;
                top++;
            }
        }

    public boolean isEmpty() {
            if (top==0)
                return true;
        return false;
    }    
    
    public T peek() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("stack");

        return stack[top--];
    }
    
    public T pop() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("stack");
        top--;
        T result = stack[top];
        stack[top]=null;
        return result;
    }
    
    private void expandCapacity() {
        T[] newArray = (T[])(new Object[stack.length*2]);
        for(int i=0;i<stack.length;i++)
            newArray[i]=stack[i];
        stack = newArray;
    }  
}
