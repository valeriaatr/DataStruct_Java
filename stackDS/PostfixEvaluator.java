/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Stack;

/**
 *
 * @author C0443852
 */
public class PostfixEvaluator {
    
    private Stack<Integer> stack;
        
    PostfixEvaluator(){
        this.stack = new Stack<Integer>();
    }
        //convert postfix to char array, like in StackApplication
        // +, tracking how many elements in this array
    public int evaluate (String postfix){
        char[] postChars = postfix.toCharArray();
        int arraySize = postChars.length;
        
        //trace each single element, to determine operator, and evaluate
        for (int i=0; i<arraySize; i++){
            char operator = postChars[i];
                if(isOperator(operator)){
                    switch (operator){
                        case '+': stack.push(stack.pop() + stack.pop()); break;
                        case '-': stack.push(-stack.pop() + stack.pop()); break;
                        case '*': stack.push(stack.pop() * stack.pop()); break;
                        case '/': stack.push(1/stack.pop() * stack.pop()); break;
                        
                    }
                }
                //if char is digit, push on the stack
                else if (Character.isDigit(operator)){
                    stack.push(0); // operator cannot be pushed to Int Stack
                        while (Character.isDigit(postChars[i]))
                            stack.push (10*stack.pop()+(postChars[i++]- '0'));
                }
        }//end of for-loop
        if (!stack.isEmpty())
            return stack.pop();
        else return 0;
    }
    
    private static boolean isOperator(char op){
        return (op =='+' || op =='-' || op =='*' || op =='/');
    }
}
