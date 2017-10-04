import java.util.Scanner;
import java.lang.Math;
public class Disequazioni{
	public static void main (String[]args){
		Scanner input=new Scanner (System.in);
		System.out.println ("L'equazione è maggiore o minore di zero? [M/m]\t");
		char disequazione=input.next() .charAt(0);
		if(disequazione=='M'){																					//msggiore_disequazione
			System.out.println ("La disequazione è maggiore di 0");
			System.out.println ("Inserisci il termine a ");
			int a=input.nextInt();
			System.out.println ("Inserisci il termine b ");
			int b=input.nextInt();
			System.out.println ("Inserisci il termine c ");
			int c=input.nextInt();
			double delta=(b*b)-(4*a*c);
			if (delta>0){																						//maggiore_test 
				double x1=(-b-Math.sqrt(delta))/(2*a);
				double x2=(-b+Math.sqrt(delta))/(2*a);
				System.out.println ("La prima soluzione dell'equazione è: "+x1);
				System.out.println ("La seconda soluzione dell'equazione è: "+x2);
				System.out.println ("Il delta è uguale a "+delta);
				if (x1>x2){
					System.out.println ("La disequazione di secondo grado è positiva per tutti i valori che soddisfano questo intervallo di valori: x<"+x2+" e x>"+x1);
				}else{
				System.out.println ("La disequazione di secondo grado è positiva per tutti i valori che soddisfano questo intervallo di valori: x<"+x1+" e x>"+x2);
				}
			}else{
			System.out.println ("Il delta è minore di 0");
			}
		}else{																									//minore_disequazione
		System.out.println ("La disequazione è minore di 0");
		System.out.println ("Inserisci il termine a ");
		int a=input.nextInt();
		System.out.println ("Inserisci il termine b ");
		int b=input.nextInt();
		System.out.println ("Inserisci il termine c ");
		int c=input.nextInt();
		double delta=(b*b)-(4*a*c);
		if (delta>0){																							//minore_test
			double x1=(-b-Math.sqrt(delta))/(2*a);
			double x2=(-b+Math.sqrt(delta))/(2*a);
			System.out.println ("La prima soluzione dell'equazione è: "+x1);
			System.out.println ("La seconda soluzione dell'equazione è: "+x2);
			System.out.println ("Il delta è uguale a "+delta);
			if (x1>x2){
				System.out.println ("La soluzione della disequzione di secondo grado è: "+x2+"<x<"+x1);
			}else{
			System.out.println ("La soluzione della disequzione di secondo grado è: "+x1+"<x<"+x2);
			}
			}else{
			System.out.println ("Il delta è minore di 0");
			}
		}
	}
}