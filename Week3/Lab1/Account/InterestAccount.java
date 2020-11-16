
public class InterestAccount extends Account {

	private double monthlyInterestRate;
	
	public InterestAccount(double balanceIn, double monthlyInterestIn) {
		super(balanceIn);
		monthlyInterestRate = monthlyInterestIn;
	}
	
	public void addMonthlyInterest() {
		credit(getBalance()*monthlyInterestRate);
	}
	
	public void setMonthlyInterestRate(double intIn) {
		monthlyInterestRate = intIn;
	}
	
	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}
	
	public String toString() {
		return super.toString() + "\nMonthly Interest Rate: " + monthlyInterestRate;
	}
	
	
}
