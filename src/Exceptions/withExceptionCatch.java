package Exceptions;

public class withExceptionCatch {

	public static void main(String[] args) {
		
			   try{  
			      
			      int data=100/0; //here in this line exception is raised  
			   }catch(ArithmeticException e){
				   System.out.println(e);
				   }  
			   
			   System.out.println("remainig code");  
			  }  
			}  

	


