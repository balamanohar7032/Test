package Exceptions;

import java.util.Scanner;

class InvalidAgeException extends Exception{  
	 InvalidAgeException(String s){  
		 
	  super(s);  
	 }  
	}  

public class CustomException {
	static void validate(int age)throws InvalidAgeException{  
	     if(age<18)  
	         throw new InvalidAgeException("not valid");  
	        else  
	         System.out.println("welcome to vote");  
	      }  
	        

	public static void main(String[] args) {
		
	      try{  
	    	  Scanner sc=new Scanner(System.in);
	    	  System.out.println("enter age");
	    	  int age=sc.nextInt();
	    	  
	         validate(age);  
	         }catch(InvalidAgeException e){
	        	 System.out.println("Exception occured: "+e);}  
	     
	         
	     }  
	   }  
		
	


