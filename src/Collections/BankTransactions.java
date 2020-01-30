package Collections;

import java.util.*;


public class BankTransactions {

	public static void main(String[] args) {
		
		BankTransactionsLogic btl=new BankTransactionsLogic();
	Scanner scanner=new Scanner(System.in);
		Set<BankAccount> set=new HashSet<BankAccount>();
		set.add(new BankAccount(1234,10000));
		set.add(new BankAccount(1235,12000));
		set.add(new BankAccount(1236,14000));
		
		System.out.println(set);
		 System.out.println("enter your choice");
		  String  choice = scanner.next();
		  switch(choice){
		  case "deposit":
			  
			  System.out.println("enter accountnumber you want to deposit ");
			  double accnumber=scanner.nextDouble();
			 
			 
			  System.out.println("enter ammount you want to deposit");
			  double amount=scanner.nextDouble();
			  
			  Set<BankAccount>  set1 =  btl.deposit(accnumber,amount,set);
			  System.out.println(set1);
			  
       case "withdraw":
			  
			  System.out.println("enter accountnumber you want to withdraw");
			  double accnumber1=scanner.nextDouble();
			 
			 
			  System.out.println("enter ammount you want to withdraw");
			  double amount1=scanner.nextDouble();
			  
			  Set<BankAccount>  set2 =  btl.Withdraw(accnumber1,amount1,set);
			  System.out.println(set2);
			  break;
			  
		  
	}

}
}
