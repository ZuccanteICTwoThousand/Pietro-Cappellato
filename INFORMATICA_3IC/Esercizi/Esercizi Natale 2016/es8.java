
import java.util.Scanner;

public class es8 {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero");
        int numero = input.nextInt();
		
		es7 verita = new es7();		//uso la funzione per verificare che sia numero primo
		
		System.out.println();
		System.out.println("I numeri primi fino a "+numero+" sono :");
		System.out.println();
		
		System.out.println(1);		//provvisorio
		for(int i=0; i<=numero;i++){
			if (verita.primo(i)== true){
				System.out.println(i);
			}
		}
	}
}
		
		

