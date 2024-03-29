package Entities_exercicio;

import Exceptions_exercicio.BusinessException_exercicio;

public class Account_exercicio {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account_exercicio() {
	}
	public Account_exercicio(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}
	public void validateWithdraw(double amount) {
		if(amount > getWithdrawLimit()) {
			throw new BusinessException_exercicio("Error de saque: A quantia excede o limite de saque");
		}
		if(amount > getBalance()) {
			throw new BusinessException_exercicio("Error de saque: Saldo insuficiente");
		}
	}
}
