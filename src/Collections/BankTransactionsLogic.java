package Collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;


public class BankTransactionsLogic {
	
	public Set<BankAccount> deposit(double  accnumber,double amount,Set<BankAccount> set){
		List<BankAccount> list = new CopyOnWriteArrayList<BankAccount>(set);
		int temp=0;
		for(BankAccount b: list) {
			if(b.Accno==accnumber) {
				amount=b.amount+amount;
				list.set(temp,new BankAccount(accnumber,amount));
			}temp++;
		}Set<BankAccount> set1=new HashSet<BankAccount>(list);
		return set1;
		
	}
		

	public Set<BankAccount> Withdraw(double accnumber1, double amount1, Set<BankAccount> set) {
		List<BankAccount> list = new CopyOnWriteArrayList<BankAccount>(set);
		int temp=0;
		for(BankAccount b: list) {
			if(b.Accno==accnumber1) {
				if(b.amount>=amount1) {
				amount1=b.amount-amount1;
				list.set(temp,new BankAccount(accnumber1,amount1));
				}else {
					System.out.println("insufficient balence in accontnumber"+accnumber1);
				}
			}temp++;
		}Set<BankAccount> set2=new HashSet<BankAccount>(list);
		   
		return set2;
		
	}
	}



