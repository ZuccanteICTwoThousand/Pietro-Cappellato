package frequency;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author pietro.cappellato
 */
public class Freq {

    Scanner input = new Scanner(System.in);
    static int[] array;
    static int[] arrayFrequenza;
    static int[] numeroFrequenza;
    int elementi;
    int massimo;

    public void Array(int elementi) {
        array = new int[elementi + 1];
        int i;
        for (i = 0; i < elementi + 1; i++) {
            array[i] = (int) (Math.random() * (elementi + 1));
        }
        arrayFrequenza = new int[elementi + 1];
    }

    public String toStringArray() {
        return Arrays.toString(array);
    }

    public String toStringFrequenza() {
        return Arrays.toString(arrayFrequenza);
    }

    public void Frequenza() {
        int frequenza;
        for (int i = 0; i < array.length; i++) {
            frequenza = 0;
            for (int j = 0; j < array.length; j++) {
                if (i == array[j]) {
                    frequenza++;
                }
            }
            if (i % 2 == 0) {
                System.out.print("Frequenza di " + i + " = " + frequenza + "  ");
            } else {
                System.out.println("Frequenza di " + i + " = " + frequenza + "  ");
            }
            arrayFrequenza[i] = frequenza;
        }
    }

    public int cercaMax() {
        massimo = arrayFrequenza[0];
        for (int i = 0; i < arrayFrequenza.length; i++) {
            if (massimo < arrayFrequenza[i]) {
                massimo = arrayFrequenza[i];
            }
        }
        return massimo;
    }
    
}
