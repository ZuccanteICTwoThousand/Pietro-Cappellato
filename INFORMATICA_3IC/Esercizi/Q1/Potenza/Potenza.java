import java.util.Scanner;
import java.lang.Math;
public class Potenza{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);				//variabili
		System.out.println ("Inserisci la base");
		int base=input.nextInt();
		System.out.println ("Inserisci l'esponente ");
		int esponente=input.nextInt();
		int i=esponente;
		int risultato=base;

		while(i>1){											//ciclo while
		risultato=risultato*base;
		i--;
		}

		System.out.println ("La potenza di "+base+" alla "+esponente+" = "+risultato);			//risultato
	}
}