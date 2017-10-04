/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

import java.util.Arrays;

/**
 *
 * @author pietro.cappellato
 */
public class MatriceEstesa {

    /**
     * metodo per verificare se è estesa
     *
     * @param array
     * @param indexFirst
     * @param indexSecond
     * @return
     */
    public boolean isEstesa(double[][] array, int indexFirst, int indexSecond) {
        int index1 = indexFirst;
        int index2 = indexSecond;
        for (int i = 0; i < array.length; i++) {
            if (index1 == array.length) {
                for (int j = 0; j < array[i].length; j++) {
                    if (index2 == array[i].length) {
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return true;

    }

    /**
     * metodo per stampare la matrice trasposta
     * @param array
     * @param indexFirst
     * @param indexSecond 
     */
    public void MatriceTrasposta(double[][] array, int indexFirst, int indexSecond) {
        int index1 = indexFirst;
        int index2 = indexSecond;
        double[] arrayProva = null;
        if (isEstesa(array, index1, index2) == true) {
            int k = index2;
            for (int j = 0; j < array[k].length; j++) {
                for (int i = 0; i < array.length; i++) {

                    arrayProva[i] = array[i][j];

                }
            }k--;
            System.out.println(Arrays.toString(arrayProva));
            

        } else {
            System.out.println("La matrice non è estesa, impossibile fare la trasposizione");
        }
    }

}
