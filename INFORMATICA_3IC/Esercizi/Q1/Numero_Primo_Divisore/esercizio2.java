import java.util.Scanner;
public class esercizio2{
		public static void main (String[]args){
			//variabili
			Scanner input=new Scanner(System.in);
			System.out.println ("Inserisci il numero");
			long numero = input.nextLong();
			long numeroVar = numero;
			long i=2L;


			//calcoli
			while (i<numeroVar){
				if (numeroVar%i== 0L){
					numeroVar /= i;
				}else{
					i++;
				}
			}
			//risultati
			System.out.println ("Il maggiore divisore primo di "+numero+" è "+numeroVar);
		}
	}