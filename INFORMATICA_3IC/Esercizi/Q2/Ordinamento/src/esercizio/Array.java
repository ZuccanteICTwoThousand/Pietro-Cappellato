package esercizio;

/**
 *
 * @author Pietro Cappellato
 * @version 1
 *
 */
public class Array {

    static int[] array;
    static int j = 0;
    static int k = 1;
    /**
     * variabile minimo
     */
    int minimo;
    /**
     * variabile massimo
     */
    int massimo;

    /**
     * metedo creazione array fisso di 100 elementi
     */
    public Array() {
        int i;
        array = new int[100];
        for (i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        minimo = array[0];
    }

    /**
     * metodo creazione array definito dall'utente
     *
     * @param elementi
     */
    public Array(int elementi) {
        array = new int[elementi];
        int i;
        for (i = 0; i < elementi; i++) {
            array[i] = (int) (Math.random() * elementi);
        }
        minimo = array[0];
    }

    /**
     * metodo ricerca semplice
     *
     * @param numero
     */
    public void Ricerca(int numero) {
        int i;
        boolean trovato = false;
        for (i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                System.out.println("Il numero " + numero + " è nella posizione " + i);
                trovato = true;
                break;
            }
        }
        if (i == array.length && trovato == false) {
            System.out.println("Il numero non è stato trovato");
        }
    }

    /**
     * metodo ricerca numero minore
     *
     * @return minimo
     */
    public int cercaMin() {
        minimo = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minimo > array[i]) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    /**
     * metodo ricerca numero maggiore
     *
     * @return massimo
     */
    public int cercaMax() {
        massimo = array[0];
        for (int i = 0; i < array.length; i++) {
            if (massimo < array[i]) {
                massimo = array[i];
            }
        }
        return massimo;
    }

    public int ricercaRicorsiva(int numero) {
        if (numero != array[j]) {
            j++;
            return ricercaRicorsiva(numero);
        }
        return j;
    }

    public int cercaMinRicorsivo() {
        if (minimo > array[k] && k <= array.length) {
            minimo = array[k];
            k++;
            return cercaMinRicorsivo();
        } else {
            return minimo;
        }
    }

    public int cercaMaxRicorsivo() {
        if (array[k] >= massimo && k <= array.length) {
            massimo = array[k];
            k++;
            return cercaMaxRicorsivo();
        } else {
            return massimo;
        }
    }
}
