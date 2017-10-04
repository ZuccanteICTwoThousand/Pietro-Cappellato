import java.util.*;
import java.lang.*;
public class MassimoMinimoSommaMedia{
	public static void main (String[]args){
		int numero;															//variabili
		int minimo=0, somma=0, massimo=0, totaleMenoNumero=0;
		double media=0;

		Scanner input=new Scanner (System.in);								//procedimento
		System.out.println("Inserisci un numero");
		numero=input.nextInt();
		minimo=numero;
		while (numero!=0){
			if (numero<minimo){
			minimo=numero;
			}else{
			if (numero>massimo){
			massimo=numero;
			}
			}
		somma=somma+numero;
		totaleMenoNumero=totaleMenoNumero+1;
		System.out.println("Inserisci un numero");
		numero=input.nextInt();
		}
		if(totaleMenoNumero>0){
		media=somma/totaleMenoNumero;
		}
		
		System.out.println("Il numero più piccolo della serie di numeri è: "+minimo);		//risultati
		System.out.println("Il numero più grande della serie di numeri è: "+massimo);
		System.out.println("La somma di tutti i numeri è: "+somma);
		System.out.println("La media di tutti i numeri è: "+media);
	}
}