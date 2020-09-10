/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author C0443852
 */
public interface Searcher {
    // Constants
    public static final int NOT_FOUND = -1;
    //      where the key is located. If the key is not found, NOT_FOUND is returned.
    public int searchFor(int key);
    //      This method, when implemented, will display the search pool.
    public void display ();
    public void fill();
}
