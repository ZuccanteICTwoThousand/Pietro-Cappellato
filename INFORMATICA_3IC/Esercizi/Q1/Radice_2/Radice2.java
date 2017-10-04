import java.util.Scanner;
import java.lang.Math;
public class Radice2{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);					//variabili
		System.out.println ("Inserisci il numero");
		int n=input.nextInt();
		int k=1;
		
		while(k*k<=n){											//ciclo while
		k++;
		}
		k=k-1;

		System.out.println ("La radice è="+k);					//risultato
		}
}