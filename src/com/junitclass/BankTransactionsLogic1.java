package com.junitclass;


import java.util.List;


import Collections.BankAccount;

public class BankTransactionsLogic1 {
	
	
	public List<BankAccount> deposit(double  accnumber,double amount,List<BankAccount> list){
		
		int temp=0;
		for(BankAccount b: list) {
			if(b.Accno==accnumber) {
				amount=b.amount+amount;
				list.set(temp,new BankAccount(accnumber,amount));
			}temp++;
		}
		return list;
		
	}
		

	public List<BankAccount> withdraw(double  accnumber1,double amount1,List<BankAccount> list1) {
		
		int temp=0;
		for(BankAccount b: list1) {
			if(b.Accno==accnumber1) {
				if(b.amount>=amount1) {
				amount1=b.amount-amount1;
				list1.set(temp,new BankAccount(accnumber1,amount1));
				}else {
					System.out.println("insufficient balence in accontnumber"+accnumber1);
				}
			}temp++;
		}
		   
		return list1;
		
	}

}
