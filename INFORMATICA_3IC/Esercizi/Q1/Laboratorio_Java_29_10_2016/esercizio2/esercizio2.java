import java.lang.Math;
public class esercizio2 {
    public static void main(String[] args) {
		final int MAX = 20;
		int numero, ma, mb, risultato;
		risultato = 2;

		for (numero = 2; numero <= MAX; numero++){
			ma = numero;
			mb = risultato;
			while(ma !=mb){
				if (ma<mb) ma += numero;
				else mb += risultato;
			}
			risultato = mb;
		}
	System.out.println (risultato);
	}

}


