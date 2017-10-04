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
class Node<AnyType> {

    public AnyType data;
    public Node<AnyType> next;

    public Node(AnyType data) {
        this(data, null);
    }

    public Node(AnyType data, Node<AnyType> n) {
        this.data = data;
        next = n;
    }
}
