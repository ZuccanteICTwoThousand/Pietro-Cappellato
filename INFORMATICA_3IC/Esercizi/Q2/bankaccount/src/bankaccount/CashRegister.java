package bankaccount;

/**
 @author pietro.cappellato
 */
public class CashRegister {
	double pagamento, prezzo;

	CashRegister() {
		this.pagamento = 0;
		this.prezzo = 0;
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
		this.pagamento = 0;
		this.prezzo = 0;
		return restituisci;
	}

}
