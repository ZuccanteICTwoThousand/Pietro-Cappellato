/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.NoSuchElementException;

/**
 *
 * @author pietro cappellato
 * @version 1.0
 */
public class QueueDemo implements QueueInterface {

    private final Object[] dati;
    private int first;
    private int last;
    private int n;

    public QueueDemo(int n) {
        this.n = n;
        this.dati = new Object[n];
        this.first = 0;
        this.last = 0;
    }

    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return first == last;
    }

    @Override
    public void enqueue(Object d) {

        Object oldlast = dati[last];
        dati[last++] = d;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast = last;
        }
        n++;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        Object item = dati[first];
        first++;
        n--;
        if (isEmpty()) {
            last = 0;
        }
        return item;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        return dati[first];
    }

    public boolean isFull() {
        return last - first > dati.length;
    }

}
