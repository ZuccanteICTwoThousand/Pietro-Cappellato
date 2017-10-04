package bankaccount;

/**
 @author pietro.cappellato
 */
public class CashRegister_2 {
	double pagamento, prezzo;

	CashRegister_2() {
		azzera();
	}

	void enterPay(double money) {
		this.pagamento += money;
	}

	void recordPurchase(double amount) {
		this.prezzo += amount;
	}

	double giveChange() {
		double restituisci;
		if (this.pagamento >= this.prezzo) {
			restituisci = this.pagamento - this.prezzo;
		} else {
			return restituisci = -1;
		}
		azzera();
		return restituisci;
	}

	private void azzera() {
		this.pagamento = 0;
		this.prezzo = 0;
	}
}
