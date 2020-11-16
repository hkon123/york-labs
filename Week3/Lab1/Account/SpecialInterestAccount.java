
public class SpecialInterestAccount extends InterestAccount {

	private double premiumInterestRate;
	private int transactions;
	
	public SpecialInterestAccount(double balanceIn, double monthlyInterestIn, double premiumInterestIn) {
		super(balanceIn, monthlyInterestIn);
		premiumInterestRate = premiumInterestIn;
		transactions = 0;
	}
	
	public double getPremiumInterestRate() {
		return premiumInterestRate;
	}
	
	public void setPremiumInterestRate(double premiumInterestRateIn) {
		premiumInterestRate = premiumInterestRateIn;
	}
	
	@Override
	public void credit(double amount) {
		super.credit(amount);
		transactions++;
	}
	
	@Override
	public boolean debit(double amount) {
		transactions++;
		return super.debit(amount);
	}
	
	@Override
	public void addMonthlyInterest() {
		if(transactions<4) {
			credit(getBalance()*premiumInterestRate);
		}
		else {
			credit(getBalance()*getMonthlyInterestRate());
		}
	}
	
	public String toString() {
		return super.toString() + "\nPremium Interest Rate: " + premiumInterestRate + "\nTransactions: " + transactions;
	}
}
