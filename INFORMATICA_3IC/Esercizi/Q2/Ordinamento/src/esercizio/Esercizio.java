package esercizio;

import java.util.Scanner;

/**
 *
 * @author Pitro Cappellato
 * @version 1
 *
 */
public class Esercizio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci la dimensione dell'array:");
        int elementi = input.nextInt();
        Array ciao = new Array(elementi);
        System.out.println("_______________________________");

        System.out.println("Inserisci il numero da trovare:");
        int ricerca = input.nextInt();
        System.out.println("_______________________________");

        ciao.Ricerca(ricerca);
        System.out.println("MIN: " + ciao.cercaMin());
        System.out.println("MAX: " + ciao.cercaMax());
        System.out.println("_______________________________");
        
        
        //System.out.println("RICERCA: " + ciao.ricercaRicorsiva(ricerca));
        //System.out.println("MIN: " + ciao.cercaMinRicorsivo());
        //System.out.println("MAX: " + ciao.cercaMaxRicorsivo());
    }

}
