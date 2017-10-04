package esercizio_4;

import java.util.Scanner;

/**
 *
 * @author pietro.cappellato
 */
public class Esercizio_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Modello : ");
        String modello = input.nextLine();
        System.out.println();
        System.out.print("Identificativo : ");
        String identificativo = input.nextLine();
        System.out.println();
        System.out.print("Compagnia : ");
        String compagnia = input.nextLine();

        Aereo volo1 = new Aereo(modello, identificativo);

        String compagniaRiserva = "Alitalia";

        volo1.setCompagnia(compagniaRiserva);
        System.out.println("Modello : " + volo1.getModello());
        System.out.println("Identificativo : " + volo1.getIdentificativo());
        System.out.println("Compagnia : " + volo1.getCompagnia());
    }

}
