package Entities_H;

public final class SavingsAccount_H extends Account_H {
	
	private Double interestRate;
	
	public SavingsAccount_H() {
		super();
	}
	public SavingsAccount_H(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public void updateBalance() {
		balance += balance * interestRate;
	}
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
