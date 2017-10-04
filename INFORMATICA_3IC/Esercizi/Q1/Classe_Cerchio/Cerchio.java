import java.util.Scanner;
public class Cerchio{
		public static void main (String[]args){
			Scanner input = new Scanner(System.in);			//variabili
			System.out.println ("Inserisci il raggio");
			Circle c1 = new Circle(input.nextDouble());

			double risultatoCirconf=c1.getCirconf(); 		//calcoli
			double risultatoArea=c1.getArea();

			System.out.println ("Il raggio del cerchio = "+risultatoCirconf); //risultati
			System.out.println ("L'area del cerchio = "+risultatoArea);
		}
	}