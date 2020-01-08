package com.bankaccount;

public interface IRate {

	//create default method for base rate return 2.5
	default double getBaseIRate() {
		
		return 2.5;
		
	}
}
