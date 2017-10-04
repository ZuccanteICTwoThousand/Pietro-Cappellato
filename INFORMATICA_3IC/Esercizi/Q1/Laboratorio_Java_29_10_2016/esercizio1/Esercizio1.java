public class Esercizio1 {
    public static void main(String[] args) {

		final int MAX = 4000000;

		int fibo1, fibo2, scambio, fiboRis;

		fibo1 = 1;
		fibo2 = 1;
		fiboRis = 0;

		while (fibo2<MAX){
			if (fibo2%2==0){
				fiboRis = fibo2 + fiboRis;
			}
			scambio = fibo2;
			fibo2 = fibo1 +fibo2;
			fibo1 = scambio;


		}
		System.out.println (fiboRis);
	}

}


