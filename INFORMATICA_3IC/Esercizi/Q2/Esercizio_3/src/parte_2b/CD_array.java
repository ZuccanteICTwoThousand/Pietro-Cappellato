package parte_2b;

/**
 *
 * @author pietro.cappellato
 */
public class CD_array {

    CD_array() {
        System.out.println("array creato");
    }

    //indici
    int index = 0;
    final int standard = 100;

    //creazione array della classe CD
    CD[] collector;

    public void addCD(String titolo, String autore, String casa, String proprietario) {
        if (index <= standard) {
            CD addCD1 = new CD(titolo, autore, casa, proprietario);
            collector[index] = addCD1;
            index++;
        } else {
            System.out.println("Not enough space");
        }

    }

    public void removeCD(int i) {
        CD vuoto = new CD();
        collector[i] = vuoto;
    }

    //metodi search
    public void searchForTitolo(String t) {
        int volte = 0;
        System.out.println("Ricerca per titolo (" + t + ") :");
        for (int j = 0; j <= standard; j++) {
            if (collector[j].getTitolo() == t) {
                System.out.println("----------------------------------------");
                collector[j].stampaCD();
                volte++;
            }
        }
        if (volte == 0) {
            System.out.println("nessun risultato dalla ricerca");
        }
    }

    public void searchForAutore(String a) {
        int volte = 0;
        System.out.println("Ricerca per autore (" + a + ") :");
        for (int j = 0; j <= standard; j++) {
            if (collector[j].getAutore() == a) {
                System.out.println("----------------------------------------");
                collector[j].stampaCD();
                volte++;
            }
        }
        if (volte == 0) {
            System.out.println("nessun risultato dalla ricerca");
        }
    }

    public void searchForCasa(String c) {
        int volte = 0;
        System.out.println("Ricerca per Casa Discografica (" + c + ") :");
        for (int j = 0; j <= standard; j++) {
            if (collector[j].getCasa() == c) {
                System.out.println("----------------------------------------");
                collector[j].stampaCD();
                volte++;
            }
        }
        if (volte == 0) {
            System.out.println("nessun risultato dalla ricerca");
        }
    }

    public void searchForProprietario(String p) {
        int volte = 0;
        System.out.println("Ricerca per Proprietario (" + p + ") :");
        for (int j = 0; j <= standard; j++) {
            if (collector[j].getProprietario() == p) {
                System.out.println("----------------------------------------");
                collector[j].stampaProprietario();
                volte++;
            }
        }
        if (volte == 0) {
            System.out.println("nessun risultato dalla ricerca");
        }
    }

    //metodo di stampa
    public void printCollection() {
        for (int j = 0; j <= standard; j++) {
            System.out.println("----------------------------------------");
            collector[j].stampaProprietario();
        }
    }
}
