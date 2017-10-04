/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

/**
 *
 * @author pietro.cappellato
 */
public class Esercizio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] array = {3, 10, 3, 9, 6, 6, 9, 7, 7, 5, 4, 5, 1, 5, 4, 5, 10, 9, 2, 4};
        int frequenzaGravInsuf= Esercizio3.frequenza(array,1);
    }

    public int frequenza(int[] array, int n) {
        int esempio = n;
        int frequenza = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == esempio) {
                frequenza++;
            }
        }
        return frequenza;
    }

}
