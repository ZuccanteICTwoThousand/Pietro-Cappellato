
import java.util.Scanner;

public class prova12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);			//variabili

        //test moltiplicazione
        System.out.println("Inserisci il fattore 1");
        int fat1 = input.nextInt();
        System.out.println("Inserisci il fattore 2 ");
        int fat2 = input.nextInt();

        es12 ris1 = new es12();

        int risultatoMolt = ris1.moltiplicazione(fat1, fat2);

        System.out.println("Il risultato della moltiplicazione tra " + fat1 + "x" + fat2 + "=" + risultatoMolt);

        System.out.println();
        System.out.println("{}{}{}{}{}}{}{}{}{}{}{}{}{}");
        System.out.println();

        //test radiceInt
        System.out.println("Inserisci la radice ");
        int radice = input.nextInt();

        es12 ris2 = new es12();

        int risultatoRadice = ris2.radiceInt(radice);

        System.out.println("La radice quadrata di " + radice + " è " + risultatoRadice);
    }
}
