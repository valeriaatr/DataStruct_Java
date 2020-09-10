package Stack;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Stack;

/**
 * Application to demonstrate the use of a stack by simulating an editor's un/redo operations.
 *
 * @author lynda
 */
public class UndoRedo {
    
    /*public static Scanner openFile(String fileName) throws IOException {
        FileInputStream fileByteStream = new FileInputStream(fileName);
        return(new Scanner(fileByteStream));
    }*/
    
    public static void main(String[] args) throws Exception {
        String fileName="UD.txt";
        Scanner inputFileStream;
        
        /* Declare two stacks here: one for the undo and one for the redo
        */
        ArrayStack undo = new ArrayStack();
        ArrayStack redo = new ArrayStack();
        
        String operation;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter file name: ");
        inputFileStream = openFile(keyboard.nextLine());
        
        while (inputFileStream.hasNextLine()) {
            operation = inputFileStream.nextLine();
            while (inputFileStream.hasNextLine()) {
                operation = inputFileStream.nextLine();
                if (!operation.equals("undo") && !operation.equals("redo")){
                        performOperation(operation);
                        undo.push(operation);
                }    
                if(operation.equals("undo")){
                    if (undo.size()==0)
                        System.out.println("Nothing to undo");
                    else {
                        redo.push(undo.pop());
                        performOperation(operation);
                    }
                }
                else if(operation.equals("redo")){
                    if (redo.size()==0)
                        System.out.println("Nothing to redo");
                    else {
                        undo.push(redo.pop());
                        performOperation(operation);
                    }
                }
            }
        }inputFileStream.close();
    }
    public static Scanner openFile(String fileName) throws IOException {
        Scanner fileStream;
        FileInputStream fileByteStream = new FileInputStream(fileName);
        return(new Scanner(fileByteStream));
    }
    
    public static void performOperation(String operation) {
          System.out.println("Operation: " + operation + " completed.");
    }
}