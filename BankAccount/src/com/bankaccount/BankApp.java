package com.bankaccount;

public class BankApp {

	public static void main(String[] args) {
		System.out.println("\t\tBANK OF JAVA");
		System.out.println("\t---------------------------------");
		
		Checking chk = new Checking("omar","12345678",100);
		
		chk.showInfo();
		System.out.println("\t------------TRANSACTION-------------");
		chk.deposit(300);
		chk.withdraw(50);
		chk.transfer("mommy", 50);
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		
		Saving svg = new Saving("omar","12345678",200);
		svg.showInfo();
		svg.accInterest();
	}

}
