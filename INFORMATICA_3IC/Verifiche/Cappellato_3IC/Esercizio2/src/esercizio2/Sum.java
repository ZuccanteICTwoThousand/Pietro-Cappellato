/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import java.util.Arrays;

/**
 *
 * @author pietr.cappellato
 */
public class Sum {

    /**
     * metodo per il ritorno dell'array sommato
     *
     * @param array
     * @param index
     */
    public void returnSomma(double[] array, int index) {
        double[] arrayProva = {0, 0, 0, 0, 0};
        int x = 5;
        for (int i = 0; i < index; i++) {
            arrayProva[i] = somma(array, x);
            x--;
        }
        System.out.println(Arrays.toString(arrayProva));
    }

    /**
     * metodo per la somma degli elementi
     *
     * @param array
     * @param x
     * @return
     */
    public double somma(double[] array, int x) {
        double n = 0;
        int j = 5;
        for (j = j - x; j < x; j++) {
            n = n + array[j];
        }
        return n;
    }

}
