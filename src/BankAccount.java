
public class BankAccount {
	double balance;
	
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(double withdrawAmount) throws NegativeBalanceException{
		if(withdrawAmount > balance) {
			throw new NegativeBalanceException(withdrawAmount - balance);
		}else {
			balance -= withdrawAmount;
		}
	}
	
	public void quickWithdraw(double withdrawAmount) throws NegativeBalanceException{
		if(withdrawAmount > balance) {
			throw new NegativeBalanceException();
		}else {
			balance -= withdrawAmount;
		}
	}

}
