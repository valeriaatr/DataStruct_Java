package Stack;

import java.util.Scanner;


/**
 *
 * @author C0443852
 */
public class StackApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sentence to Reverse: ");
        String word = input.nextLine();
        System.out.print(reverseData(word));
            
    }
    public static StringBuilder reverseData(String word){
        ArrayStack<Character> sentence = new ArrayStack<Character>();
        char space = ' ';
        char[] cr = word.toCharArray();
        StringBuilder stringB = new StringBuilder(cr.length);
        
        for (int i=0;i<cr.length;i++){
            if(cr[i]!=space){ //fill stack, until we reach space
                              //(on and on,to consider each word to be in its place before reverse)
                sentence.push(cr[i]);
                    if (i!=cr.length-1)
                        continue;
            }
            while (!sentence.isEmpty())
                stringB.append(sentence.pop());//removing and appending chars to StringBuilder
            stringB.append(space);//when sentence is empty, append SPACE, and start all over again
        }   
        return stringB;
    }
}
