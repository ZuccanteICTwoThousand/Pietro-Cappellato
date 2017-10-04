import java.util.Scanner;
import java.lang.Math;
public class EquazioneSecondoGrado{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in); 					//variabili
		System.out.println ("Inserisci il termine A ");
		int a=input.nextInt();
		System.out.println ("Inserisci il termine B ");
		int b=input.nextInt();
		System.out.println ("Inserisci il termine noto C ");
		int c=input.nextInt();

		double delta=(b*b)-(4*a*c);								//codice
		double x1=(-b-Math.sqrt(delta))/(2*a);
		double x2=(-b+Math.sqrt(delta))/(2*a);

		System.out.println ("La prima soluzione è: "+x1);		//risultato
		System.out.println ("La seconda soluzione è: "+x2);
	}
}