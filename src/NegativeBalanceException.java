import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class NegativeBalanceException extends Exception {
	double negativeBalance;

	public NegativeBalanceException() {
		super("Error: negative balance");
	}

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
