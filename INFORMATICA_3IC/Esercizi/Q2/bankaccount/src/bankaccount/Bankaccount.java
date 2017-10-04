package bankaccount;

import java.util.ArrayList;

/**
 @author pietro.cappellato
 */
public class Bankaccount {
	public static void main(String[] args) {
		CashRegister_3 banca = new CashRegister_3();
		banca.recordPurchase(3.90);
		banca.per(2);
		banca.recordPurchase(4.10);
		banca.sale(50);
		banca.recordPurchase(2.90);
		banca.sale(35);
		banca.per(5);

		banca.enterPay(5);
		banca.enterPay(20);
		
		stampaProdotti("Prezzi Prodotti", banca.prezziProdotti);
		System.out.println("Credito Inserito :" + banca.pagamento);
		System.out.println("Prezzo Totale :" + banca.getPrice());
		System.out.println("Resto :" + String.format("%.2f", banca.giveChange()));

	}

	private static void stampaProdotti(String prima, ArrayList<Double> prezziProdotti){
		System.out.print(prima);
		System.out.print("[ ");
		for( Double elemento : prezziProdotti){
			System.out.print(String.format("%.2f",elemento));
			System.out.print(" ");
		}
		System.out.println("]");
	}
}
