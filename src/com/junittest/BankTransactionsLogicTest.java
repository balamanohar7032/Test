package com.junittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import org.junit.jupiter.api.Test;

import com.junitclass.BankTransactionsLogic1;

import Collections.BankAccount;



public class BankTransactionsLogicTest {
	
	BankTransactionsLogic1 btl=new BankTransactionsLogic1();
	@Test
	public void depositTest() {
		
		 
		Set<BankAccount> expected=new HashSet<BankAccount>();
		expected.add(new BankAccount(1234,10000));
		expected.add(new BankAccount(1235,12000));
		expected.add(new BankAccount(1236,14000));
		List<BankAccount> list = new CopyOnWriteArrayList<BankAccount>(expected);
		
		List<BankAccount>  actual = btl.deposit(1234,10000,list );
		
		
		   assertEquals(list,actual);	
	}
	
	@Test
	public void withdrawTest() {
		
		 
		Set<BankAccount> expected1=new HashSet<BankAccount>();
		expected1.add(new BankAccount(1234,10000));
		expected1.add(new BankAccount(1235,12000));
		expected1.add(new BankAccount(1236,14000));
		List<BankAccount> list1 = new CopyOnWriteArrayList<BankAccount>(expected1);
		
		List<BankAccount>  actual2 = btl.withdraw(1236, 10000, list1 );
		
		   assertEquals(list1,actual2);	
	}

}
