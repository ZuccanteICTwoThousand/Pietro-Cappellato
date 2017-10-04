/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue_2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author pietro cappellato
 * @version 1.0
 */
class ListIterator<Item> implements Iterator<Item> {

    private Node<Item> current;

    public ListIterator(Node<Item> first) {
        current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Item next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Item item = current.item;
        current = current.next;
        return item;
    }
}
