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
public class BinarySearcher implements Searcher {
    private int[] numbers;
    private int ARRAY_SIZE=5;
 // Declare the zero parameter constructor.
    //      It should create the array for numbers and initialize it.
    BinarySearcher(){
    this.numbers = new int[ARRAY_SIZE];
    }

    @Override
    public int searchFor(int key) {
        
    int low=0;
    int high=numbers.length-1;
    int mid;
        while (low<=high){
        mid = (low+high)/2;
            if (key>numbers[mid])
                low = mid+1;
            else if (key<numbers[mid])
                high = mid-1;
            else { 
                System.out.println("Found index at Binary Search: "+ mid);
                return mid; 
            }
        }
        return NOT_FOUND;
    }

    @Override
    public void display() {
        System.out.print("Numbers stored: ");
        for (int i=0;i<ARRAY_SIZE; i++){
            System.out.print(numbers[i]);
        }
        System.out.print("\n");
    }

    public void fill() {
        System.out.print("Enter numbers to store: ");
        Scanner input = new Scanner(System.in);
        for(int i=0;i<ARRAY_SIZE;i++){
            this.numbers[i]=input.nextInt();
        }
    }
}
