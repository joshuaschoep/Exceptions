
public class ATM {
	private BankAccount account1;
	
	public ATM() {
		account1 = new BankAccount(500);
	}
	
	public void handleTransactions() {
		try {
			account1.withdraw(600);
		}catch(NegativeBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		ATM atm1 = new ATM();
		atm1.handleTransactions();
	}
}
