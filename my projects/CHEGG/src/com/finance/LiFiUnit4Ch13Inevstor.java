package com.finance;

public class LiFiUnit4Ch13Inevstor extends Finance{
	private String name;
	private int uniqueId;
	private int accountNumber;
	private int initialBalance;
	
	public LiFiUnit4Ch13Inevstor(int accountNumber, int initialBalance)
	{
		this.accountNumber=accountNumber;
		this.initialBalance=initialBalance;
	}

	public double calculateInterest(double interestRate, double tenure, double balance) {
		//SI=(PRT)/100
		//System.out.println("interestRate:"+interestRate+" tenure:"+tenure+" balance:"+balance);
		return ((balance)*(interestRate)*tenure);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(int initialBalance) {
		this.initialBalance = initialBalance;
	}
	
	
}
