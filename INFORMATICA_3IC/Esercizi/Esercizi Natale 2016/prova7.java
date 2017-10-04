
import java.util.Scanner;

public class prova7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero");
        int numero = input.nextInt();

        es7 verita = new es7();

        System.out.println("Il numero " + numero + " è primo? " + verita.primo(numero));
    }
}
