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
public class SearchTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
    
        BinarySearcher searchB = new BinarySearcher();
        searchB.fill();
        searchB.display();
        System.out.print("Enter number to search in Binary: ");
        int key1 = input.nextInt();
        if (searchB.searchFor(key1)== Searcher.NOT_FOUND)
            System.out.println("Item not found");;
    
        LinearSearcher searchL = new LinearSearcher();
        searchL.fill();
        searchL.display();
        System.out.print("Enter number to search in Linear: ");
        int key2 = input.nextInt();
        if (searchL.searchFor(key2)== Searcher.NOT_FOUND)
            System.out.println("Item not found");;
    }
}
