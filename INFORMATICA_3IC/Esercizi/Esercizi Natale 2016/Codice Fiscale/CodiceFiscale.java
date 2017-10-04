
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class CodiceFiscale {

    private String nome, cognome, comune, m, sesso;
    private int anno, giorno;

    //elenco pari
    private final char[] elencoPari = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B',
        'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
        'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };
    //elenco dispari                                 
    private final int[] elencoDispari = {1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 1, 0, 5, 7, 9, 13,
        15, 17, 19, 21, 2, 4, 18, 20, 11, 3, 6, 8, 12, 14, 16,
        10, 22, 25, 24, 23
    };

    //mese 
    private final String[][] mese = {{"Gennaio", "A"},
    {"Febbraio", "B"},
    {"Marzo", "C"},
    {"Aprile", "D"},
    {"Maggio", "E"},
    {"Giugno", "H"},
    {"Luglio", "L"},
    {"Agosto", "M"},
    {"Settembre", "P"},
    {"Ottobre", "R"},
    {"Novembre", "S"},
    {"Dicembre", "T"}
    };

    //costruttore
    CodiceFiscale(String nome, String cognome, String comune, String m, int anno, int giorno, String sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.comune = comune;
        this.m = m;
        this.anno = anno;
        this.giorno = giorno;
        this.sesso = sesso;
    }

    //metodi get per le variabili
    public String getNome() {
        return modificaNomeCognome(nome, true);
    }

    public String getCognome() {
        return modificaNomeCognome(cognome, false);
    }

    public String getNomeInserito() {
        return nome;
    }

    public String getCognomeInserito() {
        return cognome;
    }

    public String getMese() {
        return modificaMese();
    }

    public String getMeseInserito() {
        return m;
    }

    public int getAnno() {
		return(anno%100);
    }

    public int getAnnoInserito() {
        return anno;
    }

    int getGiorno() {
        return (sesso.equals("M")) ? giorno : (giorno + 40);
    }

    int getGiornoInserito() {
        return giorno;
    }

    String getComune() {
        return elaboraCodiceComune();
    }

    String getCodice() {
        return calcolaCodice();
    }

    String getCodiceFiscale() {
        return toString();
    }

    //metodo modificaNomeCognome
    private String modificaNomeCognome(String stringa, boolean cod) {
        String nuovastringa = "";
        stringa = stringa.replaceAll(" ", "");           // Rimuovi spazi
        stringa = stringa.toLowerCase();

        String consonanti = getConsonanti(stringa);      // Ottengo tutte le consonanti e tutte le vocali della stringa
        String vocali = getVocali(stringa);

        // Controlla i possibili casi
        if (consonanti.length() == 3) {                   // La stringa contiene solo 3 consonanti, quindi ho gia' la modifica
            nuovastringa = consonanti;
        } else if ((consonanti.length() < 3) && (stringa.length() >= 3)) {
            nuovastringa = consonanti;
            nuovastringa = aggiungiVocali(nuovastringa, vocali);
        } else if ((consonanti.length() < 3) && (stringa.length() < 3)) {
            nuovastringa = consonanti;
            nuovastringa += vocali;
            nuovastringa = aggiungiX(nuovastringa);
        } else if (consonanti.length() > 3) {

            if (!cod) {
                nuovastringa = consonanti.substring(0, 3);
            } else {
                nuovastringa = consonanti.charAt(0) + "" + consonanti.charAt(2) + "" + consonanti.charAt(3);
            }
        }

        return nuovastringa;
    }

    //metodi modifica nome cognome
    private String aggiungiX(String stringa) {
        while (stringa.length() < 3) {
            stringa += "x";
        }
        return stringa;
    }

    private String aggiungiVocali(String stringa, String vocali) {
        int index = 0;
        while (stringa.length() < 3) {
            stringa += vocali.charAt(index);
            index++;
        }
        return stringa;
    }

    private String getVocali(String stringa) {
        stringa = stringa.replaceAll("[^aeiou]", "");
        return stringa;
    }

    private String getConsonanti(String stringa) {
        stringa = stringa.replaceAll("[aeiou]", "");
        return stringa;
    }

    //metodo modifica mese
    private String modificaMese() {
        for (int i = 0; i < mese.length; i++) {
            if (mese[i][0].equalsIgnoreCase(m)) {
                return mese[i][1];
            }
        }
        return null;
    }

    //metodo elaborazione comune
    private String elaboraCodiceComune() {
        String cc = "";
        try {
            Scanner scanner = new Scanner(new File("Comuni.txt"));
            scanner.useDelimiter("\r\n");

            while (scanner.hasNext()) {
                String s1 = scanner.nextLine();
                String s2 = s1.substring(0, s1.indexOf('-') - 1);
                System.out.println(s2);
                if (s2.equalsIgnoreCase(comune)) {
                    cc = s1.substring(s1.lastIndexOf(' ') + 1);
                }
            }

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cc;
    }

    //metodo elaborazione codice di controllo
    private String calcolaCodice() {
        String str = getCognome().toUpperCase() + getNome().toUpperCase() + getAnno() + getMese() + getGiorno() + getComune();
        int pari = 0, dispari = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);              // i-esimo carattere della stringa

            // Il primo carattere e' il numero 1 non 0
            if ((i + 1) % 2 == 0) {
                int index = Arrays.binarySearch(elencoPari, ch);
                pari += (index >= 10) ? index - 10 : index;
            } else {
                int index = Arrays.binarySearch(elencoPari, ch);
                dispari += elencoDispari[index];
            }
        }

        int controllo = (pari + dispari) % 26;
        controllo += 10;

        return elencoPari[controllo] + "";
    }

    //metodo ritorno codice fiscale
    public String toString() {
        return getCognome().toUpperCase() + getNome().toUpperCase() + getAnno() + getMese() + getGiorno() + getComune() + getCodice();
    }
}
