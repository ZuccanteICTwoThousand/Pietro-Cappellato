
public class es4 {

    public static int potenza(int n, int k) {
        int risultato = 1;
        for (int i = 0; i < k; i++) {
            risultato *= n;
        }
        return risultato;
    }
}
