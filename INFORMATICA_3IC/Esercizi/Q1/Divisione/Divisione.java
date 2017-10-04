import java.util.Scanner;
import java.lang.Math;
public class Divisione{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);				//variabili
		System.out.println ("Inserisci il Dividendo");
		int d=input.nextInt();
		System.out.println ("Inserisci il Divisore");
		int d1=input.nextInt();
		int risultato=0;

		while(d>d1){										//codice
		d=d-d1;
		risultato=risultato+1;
		}
		
		System.out.println ("Il risultato="+risultato);		//risultato
		System.out.println ("Il resto="+d);
		}
}