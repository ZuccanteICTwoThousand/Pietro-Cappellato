import java.util.Scanner;
import java.lang.Math;
public class Moltiplicazione{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);					//variabili
		System.out.println ("Inserisci il fattore 1");
		int fat1=input.nextInt();
		System.out.println ("Inserisci il fattore 2 ");
		int fat2=input.nextInt();
		int i=0;
		int risultato=0;

		
		while(i<fat2){											//ciclo while
		risultato=risultato+fat1;
		i++;
		}

		System.out.println ("La moltiplicazione "+fat1+"x"+fat2+"="+risultato);		//risultato
		}
}