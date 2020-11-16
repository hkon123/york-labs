
public class InterestAccount extends Account {

	private double monthlyInterestRate;
	
	public InterestAccount(double balanceIn, double mirIn) {
		super(balanceIn);
		monthlyInterestRate = mirIn;
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
		return super.toString() + "\n Monthly Interest Rate: " + monthlyInterestRate;
	}
	
	
}
