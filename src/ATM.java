/**
 * ATM handles bankAccount objects and has member
 * handleTransactions that tests the functionality of their
 * error throwing
 * @author joshuaschoep
 *
 */
public class ATM {
	/**
	 * Account to be tested
	 */
	private BankAccount account1;
	
	/**
	 * Creates a bank account with 500 dollars
	 */
	public ATM() {
		account1 = new BankAccount(500);
	}
	
	/**
	 * Tests error handling with both withdraw method
	 * and quickWithdraw, prints error and error message to the console
	 */
	public void handleTransactions() {
		try {
			account1.withdraw(600);
		}catch(NegativeBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		try {
			account1.quickWithdraw(600);
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
