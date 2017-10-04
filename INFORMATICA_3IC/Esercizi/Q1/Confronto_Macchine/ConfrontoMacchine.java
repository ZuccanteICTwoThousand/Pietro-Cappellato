import java.util.*;
public class ConfrontoMacchine {
	public static void main (String[]args){
		int prezzoMacchina1, prezzoMacchina2, consumoBenzina1,consumoBenzina2;				//variabili
		double prezzoFinale1, prezzoFinale2;
		Scanner input=new Scanner (System.in);
		System.out.println("Inserisci il prezzo della prima macchina ");
		prezzoMacchina1=input.nextInt();
		System.out.println("Inserisci quanti litri consuma la macchina ogni 100km ");
		consumoBenzina1=input.nextInt();
		System.out.println("Inserisci il prezzo della seconda macchina ");
		prezzoMacchina2=input.nextInt();
		System.out.println("Inserisci quanti litri consuma la macchina ogni 100km ");
		consumoBenzina2=input.nextInt();

		prezzoFinale1=prezzoMacchina1+consumoBenzina1*1.6*1500;								//procedimento
		prezzoFinale2=prezzoMacchina2+consumoBenzina2*1.6*1500;
		if (prezzoFinale1>prezzoFinale2){
		System.out.println("La macchina più conveniente è la seconda");
		}else{
		System.out.println("La macchina più conveniente è la prima");
		}
	}
}