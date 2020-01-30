package task7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		double amount, dollar, australiandollar, code,  yen,  rupee;
		 
		DecimalFormat f = new DecimalFormat("##.##");
 
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Hii, Welcome to the Currency Converter");
 
		System.out.println("which currency You want to Convert ? ");
		
		System.out.println("1:Ruppe \n2:Dollar \n3:Australiandollar \n4:yen   ");
		code = sc.nextInt();
		
		System.out.println("How much Money you want to convert ?");
		amount = sc.nextFloat();
 
		// For amounts Conversion
		if (code == 1) {
 
			dollar = amount / 70;
			System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");
 
			australiandollar = amount / 48.5;
			System.out.println("Your " + amount + " Rupee is : " + f.format(australiandollar) + " australiandollar");
 
			yen = amount / 0.63;
			System.out.println("Your " + amount + " Rupee is : " + f.format(yen) + " Yen");
 
			
		} else if (code == 2) {
			// For Dollar Conversion
 
			rupee = amount * 70;
			System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Ruppes");
 
			australiandollar = amount * 0.78;
			System.out.println("Your " + amount + " Dollar is : " + f.format(australiandollar) + "australiandollar ");
			
            yen = amount * 111.087;
			System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");
 
			
		} else if (code == 3) {
			// For Australian dollar Conversion
 
			rupee = amount * 48.5;
			System.out.println("Your " + amount + " australiandollar is : " + f.format(rupee) + " Ruppes");
 
			dollar = amount * 0.69;
			System.out.println("Your " + amount + " australiandollar is : " + f.format(dollar) + " Dollar");
 
			yen = amount * 75.30;
			System.out.println("Your " + amount + " australiandollar is : " + f.format(yen) + " Yen");
 
			
		}  else if (code == 4) {
 
			// For Yen Conversion
 
			rupee = amount * 0.63;
			System.out.println("Your " + amount + " yen is : " + f.format(rupee) + " Ruppes");
 
			dollar = amount * 0.008;
			System.out.println("Your " + amount + " yen is : " + f.format(dollar) + " Dollar");
 
			australiandollar = amount * 0.007;
			System.out.println("Your " + amount + " yen is : " + f.format(australiandollar) + " australiandollar");

 
			
		} else {
			System.out.println("Invalid input");
		}
		
		
		
	}
 
}

	


