/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.Scanner;

/**
 *
 * @author C0443852
 */
public class LinearSearcher implements Searcher {
    private int[] numbers;
    private int ARRAY_SIZE=5;
 // Declare the zero parameter constructor.
    //      It should create the array for numbers and initialize it.
    LinearSearcher(){
        this.numbers = new int[ARRAY_SIZE];
    }
    
    // Implement the searchFor method from the interface Searcher using a linear search.
    @Override
    public int searchFor(int n){
        for(int i=0; i<ARRAY_SIZE; i++){
            if (numbers[i]==n){
                System.out.println("Found index at Linear Search: "+ i);
                return i;        
            }
        }
        return NOT_FOUND;
    }
// Implement the display method from the interface Searcher.
    @Override
    public void display() {
        System.out.print("Numbers stored: ");
        for (int i=0;i<ARRAY_SIZE; i++){
            System.out.print(numbers[i]);
            }
        System.out.print("\n");
        }

    public void fill() {
        System.out.print("Enter numbers to store in Linear: ");
        Scanner input = new Scanner(System.in);
        for(int i=0;i<ARRAY_SIZE;i++){
            this.numbers[i]=input.nextInt();
        }
    }
}
