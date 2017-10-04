/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import java.util.Arrays;

/**
 *
 * @author pietro.cappellato
 */
public class Esercizio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double[] array = {3, 2, -1, 5, 2};
        Sum ciao = new Sum();
        
        System.out.println(Arrays.toString(array));
        ciao.returnSomma(array, 5);

        
    }

}
