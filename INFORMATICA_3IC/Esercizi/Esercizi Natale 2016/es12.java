
public class es12 {

    //moltiplicazione
    public int moltiplicazione(int n1, int n2) {
        int risultato = 0;
        for (int i = 0; i < n2; i++) {
            risultato += n1;
        }
        return risultato;
    }
    //radice intera

    public int radiceInt(int n) {
        int risultato = 0;
        for (int i = n; i >= 0; i--) {
            if ((i * i) == n) {
                risultato = i;
            }
        }
        return risultato;
    }
}
