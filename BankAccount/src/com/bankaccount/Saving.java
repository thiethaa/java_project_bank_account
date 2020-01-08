package com.bankaccount;

public class Saving extends Account {
	 private int safetyDepositID;
	 private int safetyDeoisitKey;
	
	//constructor
	public Saving(String name, String sSN, double initBalance) {
		super(name,sSN, initBalance);
		//generate accountnumber +1 for saving
		accountNumber = "1"+ accountNumber;
		setSafetyDeposit();
	}

	private void setSafetyDeposit() {
		safetyDepositID = (int) (Math.random() * Math.pow(10, 3));
		safetyDeoisitKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	//implement abstract method getirate less .25 poin
	@Override
	public void setBaseIRate() {
		rate = getBaseIRate() - .25;
		
	}
	
	@Override
	public void showInfo() {
		System.out.println("ACCOUNT TYPE\t\t: SAVING");
		super.showInfo();
		System.out.println("\t*****YOUR SAVING FEATURE*****"
				+ "\nSafety Deposit Box ID\t: "+safetyDepositID
				+ "\nSafety Deposit Box key\t: "+safetyDeoisitKey
				);
	}

	@Override
	public void accInterest() {
		System.out.println("\t***TOTAL INTEREST***");
		super.accInterest();
	}
	
	
}
