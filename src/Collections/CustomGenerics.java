package Collections;

public class CustomGenerics {
    static <T> void genericDisplay (T element) 
    { 
        System.out.println(element.getClass().getName() +  " = " + element); 
    } 
   
  public static void main(String[] args) {
		   // Calling generic method with Integer argument 
        genericDisplay(11); 
   
        // Calling generic method with String argument 
        genericDisplay("manohar"); 
   
        // Calling generic method with double argument 
        genericDisplay(1.0); 
    } 
		
		

	}



