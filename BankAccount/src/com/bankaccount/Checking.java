package com.bankaccount;

public class Checking extends Account {

	 private int debitCardPIN;
	 private long debitCardNum;
	
	//constructor
	public Checking(String name, String sSN, double initBalance) {
		super(name,sSN,initBalance);
		//generate accountnumber +2 for saving
		accountNumber = "2"+ accountNumber;
		
		setDebitcard();
	}
	
	private void setDebitcard() {
		debitCardNum = (long)(Math.random() * Math.pow(10, 12));
		debitCardPIN = (int)(Math.random() * Math.pow(10, 4));
	}
	
	//implement abstract method:getiRate times .15%
	@Override
	public void setBaseIRate() {
	rate = getBaseIRate() * .15;	
	}
	
	@Override
	public void showInfo() {
		System.out.println("ACCOUNT TYPE\t\t: CHECKING");
		super.showInfo();
		System.out.println("\t*****YOUR CHECKING FEATURE*****"
				+ "\nDebit Card Number\t: "+debitCardNum
				+ "\nDebit Card PIN\t\t: "+debitCardPIN
				);
	}


	
}
