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
 *
 */
public class StackDemo implements StackInterface {

    private final Object[] dati;
    private int testa;
    private final int n;

    public StackDemo(int n) {
        this.n = n;
        this.dati = new Object[n];
        this.testa = 0;
    }

    @Override

    public boolean isEmpty() {
        return testa == 0;
    }

    @Override
    public void push(Object d) {
        if (this.isFull() == false) {
            dati[testa] = d;
            testa++;
        } else {
            System.out.println("The stack is full");
        }
    }

    @Override
    public Object pop() {
        Object r = top();
        testa--;
        return r;
    }

    @Override
    public Object top() {
        return dati[testa];
    }

    public boolean isFull() {
        return testa > dati.length;
    }

    public int size() {
        return n;
    }
}
