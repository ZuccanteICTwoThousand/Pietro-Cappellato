
import java.util.Scanner;

public class CodiceFiscaleProva {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("NOME: ");
        String nome = input.nextLine();

        System.out.print("COGNOME: ");
        String cognome = input.nextLine();

        System.out.print("COMUNE NASCITA: ");
        String comune = input.nextLine();

        System.out.print("MESE NASCITA: ");
        String mese = input.nextLine();

        System.out.print("ANNO NASCITA: ");
        int anno = input.nextInt();

        System.out.print("GIORNO NASCITA: ");
        int giorno = input.nextInt();

        System.out.println("M/F: ");
        String sesso = "F";

        CodiceFiscale prova = new CodiceFiscale(nome, cognome, comune, mese, anno, giorno, sesso);

        System.out.println(prova.getCodiceFiscale());
    }
}
