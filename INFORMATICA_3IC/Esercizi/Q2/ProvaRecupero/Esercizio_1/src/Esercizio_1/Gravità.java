/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esercizio_1;

/**
 *
 * @author pietr
 */
public class Gravità {

    final double accGrav = 9.8;

    public double getDistanza(double tempo) {
        double distanza = 0.5 * accGrav * tempo*tempo;
        return distanza;
    }

    public void stampaTabella (double[] array){
        System.out.println("TEMPO   |   DISTANZA");
        System.out.println("____________________");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+"s  |   "+getDistanza(array[i])+"m");
        }
    }
}
