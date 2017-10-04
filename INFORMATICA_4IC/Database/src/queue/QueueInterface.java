/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author pietro cappellato
 * @version 1.0
 */
public interface QueueInterface {
   /**
     * Tests if the stack is empty.
     * @return 
     */
    boolean isEmpty();

    /**
     * Inserts an item onto the top of the stack.
     * @param d
     */
    void enqueue(Object d);

    /**
     * Removes and returns the item at the top of this stack.
     * @return 
     */
    Object dequeue();

    /**
     * Returns the top item without its removal
     * @return 
     */
    Object peek(); 
}
