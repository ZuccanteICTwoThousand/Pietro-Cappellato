
public class es3 {

    public static int divisione(int divd, int divs) {
        int risultato = 0;
        int d = divd, s = divs;
        while (d >= s) {
            d = d - s;
            risultato++;
        }
        return risultato;
    }
}
