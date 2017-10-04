import java.util.Scanner;
public class CoppiaNumeri{
	public static void main (String[]args){	
	int numero;											//variabili
	int fat1=0;
	int fat2=0;

	Scanner input=new Scanner (System.in);				//procedimento
	System.out.println("Inserisci un numero");
	numero=input.nextInt();
		while (fat2<=numero){
			while (fat1<=numero){
			fat1=fat1+1;
				if (fat1*fat2==numero){
				System.out.println(fat1+"*"+fat2);
				}
			}
		fat1=0;
		fat2=fat2+1;
		}
	}
}