
import java.util.Scanner;

public class prova3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //test divisione
        System.out.println("Inserisci il dividendo");
        int dividendo = input.nextInt();
        System.out.println("Inserisci il divisore");
        int divisore = input.nextInt();

        es3 ris = new es3();

        int risultato = ris.divisione(dividendo, divisore);

        System.out.println("Il risultato della divisione tra " + dividendo + ":" + divisore + "=" + risultato);
    }
}
