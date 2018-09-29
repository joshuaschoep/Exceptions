import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Exception holding amount by which balance is negative by
 * @author joshuaschoep
 *
 */
public class NegativeBalanceException extends Exception {
	double negativeBalance;
	
	/**
	 * Passed if no parameter is given with simple message
	 */
	public NegativeBalanceException() {
		super("Error: negative balance");
	}
	
	/**
	 * Gives descriptive message if negativeBalance is given, also keeps log of error messages.
	 * @param negativeBalance Amount account is negative by
	 */
	public NegativeBalanceException(double negativeBalance) {
		super("Amount exceeds balance by " + negativeBalance);
		this.negativeBalance = negativeBalance;
		
		PrintWriter log;
		try {
			log = new PrintWriter("logfile.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Errors will not be logged");
			return;
		}
		log.println("Amount exceeds balance by " + negativeBalance);
	}

	@Override
	public String toString() {
		return "Balance of " + negativeBalance + " not allowed";
	}

}
