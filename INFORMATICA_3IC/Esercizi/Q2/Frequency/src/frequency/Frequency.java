package frequency;

import java.util.Scanner;

/**
 * @author pietro.cappellato
 */
public class Frequency {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la dimensione dell'array:");
        int elementi = input.nextInt();
        Freq frequenza = new Freq();
        frequenza.Array(elementi);

        System.out.println("_______________________________");
        System.out.println();
        System.out.println("L'array generato è questo");
        System.out.println(frequenza.toStringArray());
        System.out.println("_______________________________");
        System.out.println();
        frequenza.Frequenza();
        System.out.println();
        System.out.println(frequenza.toStringFrequenza());
        System.out.println();
        System.out.println("La frequenza massima registrata è : "+frequenza.cercaMax());
    }

}
