/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author C0443852
 */
public class PostfixTester {
    /**
     * Reads and evaluates multiple postfix expressions.
     */
    public static void main(String[] args){    
        String expression, again;
        int result;
    
        Scanner input = new Scanner(System.in);
      
        do{          
            
            PostfixEvaluator evaluator = new PostfixEvaluator();
            System.out.println("Enter a valid post-fix expression one token " +
                "at a time with a space between each token (e.g. 5 4 + 3 2 1 - + *)");
            System.out.println("Each token must be an integer or an operator (+,-,*,/)");
            
            expression = input.nextLine();
            result = evaluator.evaluate(expression);
            System.out.println("That expression equals " + result);
            System.out.print("Evaluate another expression [Y/N]? ");
            again = input.nextLine();
        } while(again.equals("Y")|| again.equals("y"));
     
    }     
    
    
    
}