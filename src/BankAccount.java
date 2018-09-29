/**
 * Manages bank account with (double) balance in it.
 * @author joshuaschoep
 *
 */
public class BankAccount {
	/**
	 * Money in account
	 */
	double balance;
	
	/**
	 * Creates a bank account with money in it
	 * @param balance Money to go into account
	 */
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	/**
	 * Takes withdrawAmount money from the account
	 * @param withdrawAmount Money to be taken from account
	 * @throws NegativeBalanceException Throws descriptive exception if withdrawAmount is more than is in the account
	 */
	public void withdraw(double withdrawAmount) throws NegativeBalanceException{
		if(withdrawAmount > balance) {
			throw new NegativeBalanceException(withdrawAmount - balance);
		}else {
			balance -= withdrawAmount;
		}
	}
	
	/**
	 * Takes withdrawAmount money from the account
	 * @param withdrawAmount Money to be taken from the account
	 * @throws NegativeBalanceException Throws simple version of NegativeBalanceException if withdrawAmount > balance in account
	 */
	public void quickWithdraw(double withdrawAmount) throws NegativeBalanceException{
		if(withdrawAmount > balance) {
			throw new NegativeBalanceException();
		}else {
			balance -= withdrawAmount;
		}
	}

}
