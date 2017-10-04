
import java.util.Scanner;

public class prova4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //test potenza
        System.out.println("Inserisci la base");
        int base = input.nextInt();
        System.out.println("Inserisci l'esponente");
        int esp = input.nextInt();

        es4 ris = new es4();

        int risultato = ris.potenza(base, esp);

        System.out.println("Il risultato della potenza di " + base + " alla " + esp + "=" + risultato);

    }
}
