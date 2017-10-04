package bankaccount;

import java.util.ArrayList;

/**
 @author pietro.cappellato
 */
public class CashRegister_3 {
	double pagamento, prezzo;
	ArrayList<Double> prezziProdotti = new ArrayList<>();

	CashRegister_3() {
		azzera();
	}

	double getPrice() {
		this.prezzo = 0;
		for (int i = 0; i < this.prezziProdotti.size(); i++) {
			this.prezzo += this.prezziProdotti.get(i);
		}
		return this.prezzo;
	}

	void recordPurchase(double amount) {
		this.prezziProdotti.add(amount);
	}

	void finalPrix() {
		for (int i = 0; i < this.prezziProdotti.size(); i++) {
			this.prezzo += this.prezziProdotti.get(i);
		}
	}

	void enterPay(double money) {
		this.pagamento += money;
	}

	void sale(double percentage) {
		this.prezziProdotti.set(this.prezziProdotti.size() - 1, (this.prezziProdotti.size() - 1) * (1 - (percentage * .01)));
	}

	void per(int numeroProdottiUguali){
		this.prezziProdotti.set(this.prezziProdotti.size() - 1,(this.prezziProdotti.get(this.prezziProdotti.size() - 1))*numeroProdottiUguali);
	}
	double giveChange() {
		double restituisciResto;

		finalPrix();
		if (this.pagamento >= this.prezzo) {
			restituisciResto = this.pagamento - this.prezzo;
		} else {
			return restituisciResto = -1;
		}
		azzera();
		return restituisciResto;
	}

	private void azzera() {
		this.pagamento = 0;
		this.prezzo = 0;
	}
}
