/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_2;

/**
 *
 * @author pietro cappellato
 * @version 1.0
 */
class StackException extends RuntimeException {

    public StackException(String name) {
        super(name);
    }

    public StackException() {
        super();
    }
}
