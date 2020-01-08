package com.bankaccount;

//parent Class implement interface IRate Class and inheritend to Checking and Saving Class
public abstract class Account implements IRate {
	private String name;
	private String sSN;
	private double balance;
	
	protected String accountNumber;
	protected double rate;
	
	private static int index = 10000;
	
	//constructor
	public Account(String name, String sSN, double initBalance) {
		this.name = name;
		this.sSN = sSN;
		this.balance = initBalance;
		
		index++;
	
		this.accountNumber = setAccountNumber();
		
		setBaseIRate();
	
	}
	
	//create abstract method to set rate
	public abstract void setBaseIRate();
	
	private String setAccountNumber() {
		//generate account number with last 2 number of SSN + 5 unique number + 3 random number
		String lastTwoSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int)(Math.random() * Math.pow(10, 3));
		
		return lastTwoSSN+uniqueID+randomNumber;
		
	}
	
	public void accInterest() {
		double accInterest = balance * (rate/100);
		balance = balance + accInterest;
		showBalance();
	}
	//list common methods deposit(),withdraw(),tansfer(),show info()
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing\t: $"+amount);
		showBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing\t: $"+amount);
		showBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering\t: $"+ amount +" to "+toWhere +" Successed");
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("TOTAL BALANCE\t: $"+ balance);
	}
	public void showInfo() {
		System.out.println("NAME\t\t\t: "+ name.toUpperCase() +
				"\nACCOUNT NUMBER\t\t: "+ accountNumber +
				"\nBALANCE\t\t\t: "+ balance +
				"\nINTEREST\t\t: "+ rate+"%");
	}
}
