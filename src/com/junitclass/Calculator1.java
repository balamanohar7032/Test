package com.junitclass;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		float a, b, res;
	    char choice;
	    Scanner sc = new Scanner(System.in);
		
	    {
	    	 
	    	 System.out.println("Enter Two Numbers : ");
	            
             a = sc.nextFloat();
             b = sc.nextFloat();
	        System.out.println("Enter Your Choice : ");
	        choice = sc.next().charAt(0);
	        switch(choice)
	        {
	            case '+' :  
	                res = a + b;
	                System.out.print("Result = " + res);
	               
	                break;
	            case '-' : 
	                res = a - b;
	                System.out.print("Result = " + res);
	                break;
	            case '*' : 
	                res = a * b;
	                System.out.print("Result = " + res);
	                break;
	            case '/' : 
	                res = a / b;
	                System.out.print("Result = " + res);
	                break;
	            case '%' : 
	                res = a % b;
	                System.out.print("Result = " + res);
	                break;
	            
	            default : System.out.print("Wrong Choice!!!");
	                break;
	        }

	    }
	}
}


