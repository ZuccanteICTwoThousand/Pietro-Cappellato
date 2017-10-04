public class EquazioneMain{
		public static void main (String[]args){
			Scanner input = new Scanner(System.in);			//variabili
			System.out.println ("Inserisci l'equazione");
			Equazione2G c1 = new Equazione2G(input.nextDouble());

			double deltaC1 = c1.getDelta; 	//calcoli
			double s1C1 = c1.getSoluzione1;
			double s2C1 = c1.getSoluzione2;

			System.out.println ("Il delta è  = "+deltaC1);
			System.out.println ("La soluzione 1 è = "+s1C1); //risultati
			System.out.println ("La soluzione 2 è = "+s2C1);
		}
	}