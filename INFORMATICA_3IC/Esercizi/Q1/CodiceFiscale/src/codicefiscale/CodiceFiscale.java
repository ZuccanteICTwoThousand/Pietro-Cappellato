package codicefiscale;

import java.lang.*;
import java.io.*;

/**
 *
 * @author pietro cappellato
 * @version 1.0.0
 * @since 10/02/2017
 *
 */
public class CodiceFiscale {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String codice = new String();
        int cont_cf = 0, i = 0;
        int random = (int) (Math.random() * 50);
        //COGNOME
        String[] cognomi = {"Rossi", "Russo", "Ferrari", "Bianchi", "Colombo", "Romano", "Ricci", "Gallo", "Greco", "Conti", "Marino", "De luca", "Bruno", "Costa", "Giordano", "Mancini", "Rizzo", "Lombardi", "Barbieri", "Moretti", "Fontana", "Santoro", "Caruso", "Mariani", "Rinaldi", "Martini", "Ferrara", "Galli", "Leone", "Serra", "Conte", "Villa", "Marini", "Ferri", "Bianco", "Monti", "De santis", "Parisi", "Fiore", "De angelis", "Longo", "Sanna", "Sala", "Romeo", "Martinelli", "Grassi", "Neri", "Marchetti", "Vitale", "Marchi"};
        String cognome = cognomi[random].toUpperCase();
        cognome = cognome.replace(" ", "");
        if (nConsonanti(cognome).length() >= 3) {
            for (cont_cf = 0; cont_cf < 3; cont_cf++) {
                codice += nConsonanti(cognome).charAt(cont_cf);
            }
        } else {
            for (cont_cf = 0; cont_cf < nConsonanti(cognome).length(); cont_cf++) {
                codice += nConsonanti(cognome).charAt(cont_cf);
            }
            if (cont_cf != 3) {
                i = 0;
                while (cont_cf != 3) {
                    if (i < nVocali(cognome).length()) {
                        codice += nVocali(cognome).charAt(i);
                        i++;
                    }
                    cont_cf++;
                }
            }
            if (codice.length() != 3) {
                codice += 'X';
            }
        }
        /**
         * NOME & COGNOME segue lo svolgimento del calcolo del nome e del
         * cognome
         *
         */
        String[] nomi = {"Francesco", "Alessandro", "Andrea", "Lorenzo", "Matteo", "Mattia", "Gabirele", "Leonardo", "Riccardo", "Davide", "Tommaso", "Giuseppe", "Marco", "Luca", "Federico", "Antonio", "Simone", "Samuele", "Pietro", "Giovanni", "Filippo", "Alessio", "Edoardo", "Diego", "Christian", "Sofia", "Giulia", "Giorgia", "Martina", "Emma", "Aurora", "Sara", "Chiara", "Gaia", "Alice", "Anna", "Alessia", "Viola", "Noemi", "Greta", "Francesca", "Ginevra", "Matilde", "Elisa", "Vittoria", "Giada", "Beatrice", "Elena", "Rebecca", "Nicole"};
        String nome = nomi[random].toUpperCase();
        if (nConsonanti(nome).length() > 3) {
            codice += nConsonanti(nome).charAt(0);
            codice += nConsonanti(nome).charAt(2);
            codice += nConsonanti(nome).charAt(3);
        } else {
            if (nConsonanti(nome).length() == 3) {
                i = 0;
                for (cont_cf = 3; cont_cf < 6; cont_cf++) {
                    while (i < 3) {
                        codice += nConsonanti(nome).charAt(i);
                        i++;
                    }
                }
            } else {
                i = 0;
                for (cont_cf = 3; i < nConsonanti(nome).length(); cont_cf++) {
                    codice += nConsonanti(nome).charAt(i);
                    i++;
                }
                if (cont_cf != 6) {
                    i = 0;
                    while (cont_cf != 6) {
                        if (i < nVocali(nome).length()) {
                            codice += nVocali(nome).charAt(i);
                            i++;
                        }
                        cont_cf++;
                    }
                }
                if (codice.length() != 6) {
                    codice += 'X';
                }
            }
        }
        /**
         * SESSO segue lo svolgimento del calcolo del sesso
         *
         */
        char sesso;
        if (random <= 24) {
            sesso = 'm';
        } else {
            sesso = 'f';
        }
        /**
         * DATA segue lo svolgimento del calcolo della data
         *
         */

        int anno = (int) (Math.random() * 94 + 1920);
        String annos = Integer.toString(anno);
        codice += annos.charAt(2);
        codice += annos.charAt(3);
        int mese = (int) (Math.random() * 12 + 1);
        int giorno = 0;
        switch (mese) {
            case 1:
                giorno = (int) (Math.random() * 31 + 1);
                codice += 'A';
                break;
            case 2:
                if (anno % 4 == 0) {
                    giorno = (int) (Math.random() * 29 + 1);
                } else {
                    giorno = (int) (Math.random() * 28 + 1);
                }
                codice += 'B';
                break;
            case 3:
                giorno = (int) (Math.random() * 31 + 1);
                codice += 'C';
                break;
            case 4:
                giorno = (int) (Math.random() * 30 + 1);
                codice += 'D';
                break;
            case 5:
                giorno = (int) (Math.random() * 31 + 1);
                codice += 'E';
                break;
            case 6:
                giorno = (int) (Math.random() * 30 + 1);
                codice += 'H';
                break;
            case 7:
                giorno = (int) (Math.random() * 31 + 1);
                codice += 'L';
                break;
            case 8:
                giorno = (int) (Math.random() * 31 + 1);
                codice += 'M';
                break;
            case 9:
                giorno = (int) (Math.random() * 30 + 1);
                codice += 'P';
                break;
            case 10:
                giorno = (int) (Math.random() * 31 + 1);
                codice += 'R';
                break;
            case 11:
                giorno = (int) (Math.random() * 30 + 1);
                codice += 'S';
                break;
            case 12:
                giorno = (int) (Math.random() * 31 + 1);
                codice += 'T';
                break;
        }
        String giornos = "";
        giornos = Integer.toString(giorno);
        if (sesso == 'm') {
            giornos = Integer.toString(giorno);
            if (giorno <= 9) {
                codice += '0';
                codice += giornos.charAt(0);
            } else {
                giornos = Integer.toString(giorno);
                codice += giornos.charAt(0);
                codice += giornos.charAt(1);
            }
        } else {
            giorno += 40;
            giornos = Integer.toString(giorno);
            codice += giornos.charAt(0);
            codice += giornos.charAt(1);
            giorno -= 40;
        }
        /**
         * COMUNE DI NASCITA segue lo svolgimento del calcolo del comune di
         * nascita
         *
         */
        String comune = new String();
        FileReader comuneFile = new FileReader(".\\src\\codicefiscale\\comuni.txt");
        BufferedReader riga = new BufferedReader(comuneFile);
        int comuneRandom = (int) (Math.random() * 8343);
        for (i = 0; i < comuneRandom; i++) {
            comune = riga.readLine();
        }
        codice += comune.substring(0, 4);
        comune = comune.substring(5, comune.length());
        /**
         * CARATTERE DI CONTROLLO segue lo svolgimento del calcolo del carattere
         * di controllo
         *
         */
        int sommaPari = 0, sommaDispari = 0;
        for (i = 1; i <= 14; i += 2) {

            switch (codice.charAt(i)) {
                case '0':
                    sommaPari += 0;
                    break;
                case '1':
                    sommaPari += 1;
                    break;
                case '2':
                    sommaPari += 2;
                    break;
                case '3':
                    sommaPari += 3;
                    break;
                case '4':
                    sommaPari += 4;
                    break;
                case '5':
                    sommaPari += 5;
                    break;
                case '6':
                    sommaPari += 6;
                    break;
                case '7':
                    sommaPari += 7;
                    break;
                case '8':
                    sommaPari += 8;
                    break;
                case '9':
                    sommaPari += 9;
                    break;
                case 'A':
                    sommaPari += 0;
                    break;
                case 'B':
                    sommaPari += 1;
                    break;
                case 'C':
                    sommaPari += 2;
                    break;
                case 'D':
                    sommaPari += 3;
                    break;
                case 'E':
                    sommaPari += 4;
                    break;
                case 'F':
                    sommaPari += 5;
                    break;
                case 'G':
                    sommaPari += 6;
                    break;
                case 'H':
                    sommaPari += 7;
                    break;
                case 'I':
                    sommaPari += 8;
                    break;
                case 'J':
                    sommaPari += 9;
                    break;
                case 'K':
                    sommaPari += 10;
                    break;
                case 'L':
                    sommaPari += 11;
                    break;
                case 'M':
                    sommaPari += 12;
                    break;
                case 'N':
                    sommaPari += 13;
                    break;
                case 'O':
                    sommaPari += 14;
                    break;
                case 'P':
                    sommaPari += 15;
                    break;
                case 'Q':
                    sommaPari += 16;
                    break;
                case 'R':
                    sommaPari += 17;
                    break;
                case 'S':
                    sommaPari += 18;
                    break;
                case 'T':
                    sommaPari += 19;
                    break;
                case 'U':
                    sommaPari += 20;
                    break;
                case 'V':
                    sommaPari += 21;
                    break;
                case 'W':
                    sommaPari += 22;
                    break;
                case 'X':
                    sommaPari += 23;
                    break;
                case 'Y':
                    sommaPari += 24;
                    break;
                case 'Z':
                    sommaPari += 25;
                    break;
            }
        }
        for (i = 0; i <= 14; i += 2) {
            switch (codice.charAt(i)) {
                case '0':
                    sommaDispari += 1;
                    break;
                case '1':
                    sommaDispari += 0;
                    break;
                case '2':
                    sommaDispari += 5;
                    break;
                case '3':
                    sommaDispari += 7;
                    break;
                case '4':
                    sommaDispari += 9;
                    break;
                case '5':
                    sommaDispari += 13;
                    break;
                case '6':
                    sommaDispari += 15;
                    break;
                case '7':
                    sommaDispari += 17;
                    break;
                case '8':
                    sommaDispari += 19;
                    break;
                case '9':
                    sommaDispari += 21;
                    break;
                case 'A':
                    sommaDispari += 1;
                    break;
                case 'B':
                    sommaDispari += 0;
                    break;
                case 'C':
                    sommaDispari += 5;
                    break;
                case 'D':
                    sommaDispari += 7;
                    break;
                case 'E':
                    sommaDispari += 9;
                    break;
                case 'F':
                    sommaDispari += 13;
                    break;
                case 'G':
                    sommaDispari += 15;
                    break;
                case 'H':
                    sommaDispari += 17;
                    break;
                case 'I':
                    sommaDispari += 19;
                    break;
                case 'J':
                    sommaDispari += 21;
                    break;
                case 'K':
                    sommaDispari += 2;
                    break;
                case 'L':
                    sommaDispari += 4;
                    break;
                case 'M':
                    sommaDispari += 18;
                    break;
                case 'N':
                    sommaDispari += 20;
                    break;
                case 'O':
                    sommaDispari += 11;
                    break;
                case 'P':
                    sommaDispari += 3;
                    break;
                case 'Q':
                    sommaDispari += 6;
                    break;
                case 'R':
                    sommaDispari += 8;
                    break;
                case 'S':
                    sommaDispari += 12;
                    break;
                case 'T':
                    sommaDispari += 14;
                    break;
                case 'U':
                    sommaDispari += 16;
                    break;
                case 'V':
                    sommaDispari += 10;
                    break;
                case 'W':
                    sommaDispari += 22;
                    break;
                case 'X':
                    sommaDispari += 25;
                    break;
                case 'Y':
                    sommaDispari += 24;
                    break;
                case 'Z':
                    sommaDispari += 23;
                    break;
            }
        }
        codice += (char) (((sommaPari + sommaDispari) % 26) + 'A');
        //OUT
        System.out.println(cognomi[random] + ";" + nomi[random] + ";" + giorno + "/" + mese + "/" + anno + ";" + comune.charAt(0) + comune.substring(1).toLowerCase() + ";" + codice);
    }

    /**
     * METODO nConsonanti
     *
     * @param incognome
     * @return string
     */
    public static String nConsonanti(String incognome) {
        String cognome = incognome;
        String nConsonanti = "";
        for (int i = 0; i < cognome.length(); i++) {
            if (cognome.charAt(i) != 'A' && cognome.charAt(i) != 'E' && cognome.charAt(i) != 'I' && cognome.charAt(i) != 'O' && cognome.charAt(i) != 'U') {
                nConsonanti += cognome.charAt(i);
            }
        }
        return nConsonanti;
    }

    public static String nVocali(String incognome) {
        String cognome = incognome;
        String nVocali = "";
        for (int i = 0; i < cognome.length(); i++) {
            if (cognome.charAt(i) == 'A' || cognome.charAt(i) == 'E' || cognome.charAt(i) == 'I' || cognome.charAt(i) == 'O' || cognome.charAt(i) == 'U') {
                nVocali += cognome.charAt(i);
            }
        }
        return nVocali;
    }
}
