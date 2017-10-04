/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

/**
 *
 * @author pietro.cappellato
 */
public class Esercizio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] array1 = {{1, 2, 3, 4}, {2, 4, 6, 8}, {3, 6, 9, 12}, {4, 8, 12, 16}};
        double[][] array2 = {{1, 2, 3, 4}, {2, 4,}, {3, 6, 9}, {4, 8, 12, 16}};
        MatriceEstesa ciao = new MatriceEstesa();

        System.out.println(ciao.isEstesa(array1, 4, 4));
        System.out.println(ciao.isEstesa(array2, 4, 4));
        
        ciao.MatriceTrasposta(array1, 4, 4);
        ciao.MatriceTrasposta(array2, 4, 4);
    }

}
