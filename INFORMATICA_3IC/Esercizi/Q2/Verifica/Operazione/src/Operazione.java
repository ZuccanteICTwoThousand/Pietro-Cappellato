
import java.util.ArrayList;

/**
 @author pietro.cappellato
 */
public class Operazione {

	public static int media(int[] a) {
		int somma = 0;
		for (int i = 0; i < a.length; i++) {
			somma += a[i];
		}
		return somma / a.length;
	}

	public static int media(ArrayList<Integer> a) {
		int somma = 0;
		for (int i = 0; i < a.size(); i++) {
			somma += a.get(i);
		}
		return somma / a.size();
	}

	public static int minimo(int a, int b) {
		if (a == b) {
			return a;
		} else {
			if (a > b) {
				return b;
			} else {
				return a;
			}
		}
	}

	public static int massimo(int a, int b) {
		if (a == b) {
			return a;
		} else {
			if (a > b) {
				return a;
			} else {
				return b;
			}
		}
	}

	public static int minimo(int[] a) {
		int minimo = 0;
		for (int i = 0; i < a.length; i++) {
			if (minimo > a[i]) {
				minimo = a[i];
			}
		}
		return minimo;
	}

	public static int massimo(int[] a) {
		int massimo = 0;
		for (int i = 0; i < a.length; i++) {
			if (massimo < a[i]) {
				massimo = a[i];
			}
		}
		return massimo;
	}

	public static int minimo(ArrayList<Integer> a) {
		int minimo = 0;
		for (int i = 0; i < a.size(); i++) {
			if (minimo > a.get(i)) {
				minimo = a.get(i);
			}
		}
		return minimo;
	}

	public static int massimo(ArrayList<Integer> a) {
		int massimo = 0;
		for (int i = 0; i < a.size(); i++) {
			if (massimo < a.get(i)) {
				massimo = a.get(i);
			}
		}
		return massimo;
	}
}
