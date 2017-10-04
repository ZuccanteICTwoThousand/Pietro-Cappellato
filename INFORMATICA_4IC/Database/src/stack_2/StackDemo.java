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
 * @param <AnyType>
 *
 */
public class StackDemo<AnyType> implements StackInterface<AnyType> {

    private Node<AnyType> top;

    /**
     * Creates a Stack
     */
    public StackDemo() {
        top = null;
    }

    /**
     * Tests if the stack is empty.
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Make the stack logically empty.
     */
    public void clear() {
        top = null;
    }

    /**
     * Inserts a new item into the stack.
     */
    public void push(AnyType data) {
        top = new Node<AnyType>(data, top);
    }

    /**
     * Removes and returns the item at the top of this stack.
     */
    public AnyType pop() {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        AnyType data = top.data;
        top = top.next;
        return data;
    }

    /**
     * Returns the top item without its removal
     */
    public AnyType top() {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return top.data;
    }

    /**
     * Returns a string representation of the Stack.
     */
    public String toString() {
        if (isEmpty()) {
            return "[ ]";
        }

        StringBuffer out = new StringBuffer("[");
        Node<AnyType> tmp = top;
        while (tmp != null) {
            out.append(tmp.data + "  ");
            tmp = tmp.next;
        }

        out.append("]");
        return out.toString();
    }

}
