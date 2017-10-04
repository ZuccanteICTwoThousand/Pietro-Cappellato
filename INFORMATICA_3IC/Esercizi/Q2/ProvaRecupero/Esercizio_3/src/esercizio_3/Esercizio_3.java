package esercizio_3;

import java.util.Scanner;

/**
 *
 * @author pietro.cappellato
 */
public class Esercizio_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //First Argument
        System.out.println("Inserisci la parola da tradurre: ");
        String phrase = input.nextLine();

        //Second Argument
        System.out.println("Inserisci il codice di cifratura: ");
        String k = input.nextLine();
        System.out.println("_______________________________");
        System.out.println();

        //The shift of the letters in the caesar Cipher
        char characters[] = phrase.toCharArray();
        //Sending the input characters into a character array 
        int shift = Integer.parseInt(k);
        int remainder = shift % 26;
        //The shift = value K       
        for (int i = 0; i < characters.length; i++) {
            if ((Character.isUpperCase(characters[i])) == true) {
                if ((int) (characters[i]) + remainder >= 90) {
                    characters[i] = (char) (characters[i] - (26 - remainder));
                } else {
                    characters[i] = (char) (characters[i] + remainder);
                }
            } else if (Character.isLowerCase(characters[i]) == true) {
                if ((int) (characters[i] + remainder) >= 122) {
                    characters[i] = (char) (characters[i] - (26 - remainder));
                } else {
                    characters[i] = (char) (characters[i] + remainder);
                }
            }
        }
        System.out.print("[ ");
        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
        }
        System.out.print(" ]");
        System.out.println();
    }
}
