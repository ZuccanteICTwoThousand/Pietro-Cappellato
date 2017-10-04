package sommastringhe;

/**
 * @brief questo programma fa la somma di due stringhe
 * @author francesco.ballarin
 * @date 08/02/2017
 */
public class SommaStringhe {

    public static String Somma(String sMassimo, String sMinimo) {
        String soluzione = "";
        int Massimo = sMassimo.length();
        int Minimo = sMinimo.length();
        int somma = 0;
        int resto = 0;
        for (int i = Massimo; i > Massimo - sMinimo.length(); i++) {
            somma = (int) (sMassimo.charAt(i) + (int) (sMinimo.charAt(i)));
            somma = somma + resto;
            resto = 0;
            if (true) {
                
            }
        }
        return soluzione;
    }

    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";

    }

}
