/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author pietro cappellato
 * @version 1.0
 */
public interface StackInterface {

    /**
     * Tests if the stack is empty.
     * @return 
     */
    boolean isEmpty();

    /**
     * Inserts an item onto the top of the stack.
     * @param d
     */
    void push(Object d);

    /**
     * Removes and returns the item at the top of this stack.
     * @return 
     */
    Object pop();

    /**
     * Returns the top item without its removal
     * @return 
     */
    Object top();
}
