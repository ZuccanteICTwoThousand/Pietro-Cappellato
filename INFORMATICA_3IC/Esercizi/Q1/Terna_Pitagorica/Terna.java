import java.lang.Math;
import java.util.Scanner;
public class Terna {
		public static void main(String[] args) {
			
			//input
			Scanner input=new Scanner(System.in);
			System.out.println ("Inserisci il Numero Max");
			int d=input.nextInt();
			
			//dichiarazione variabili
			double a, b, c, tmp;
			a=0; b=0; c=0; tmp=0;

				for (int i = 1; i < d; i++){
				for (int j = i + 1; j < d; j++){

					tmp = i*i + j*j;

						if (i+j+Math.sqrt(tmp) == d){
							a = i;
							b = j;
							c = Math.sqrt(tmp);
					}
				}
			}
			
			//System.out.print
			System.out.print("a= ");
			System.out.println((int)(a));
			System.out.print("b= ");
			System.out.println((int)(b));
			System.out.print("c= ");
			System.out.println((int)(c));
			System.out.print("somma= ");
			System.out.println((int)(a+b+c));
			System.out.print("prodotto= ");
			System.out.println((int)(a*b*c));

	}
}