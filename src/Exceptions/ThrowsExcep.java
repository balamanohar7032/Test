package Exceptions;

public class ThrowsExcep {
	static void fun() throws  InterruptedException 
    { 
        System.out.println("hii "); 
        Thread.sleep(2000);
        System.out.println("hello");
    } 


	public static void main(String[] args) throws InterruptedException {
		 
            fun();
            fun();
         
    } 
} 


		

	


