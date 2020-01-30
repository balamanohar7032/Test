package Collections;
class Test<T> 
{ 
    // An object of type T is declared 
    T obj; 
    
    Test(T obj) {  
    	
            this.obj = obj; 
            } 
   
    public T getObject()  {
    	
             return this.obj;

    } 
} 


public class CustomGenericsClass {

	public static void main(String[] args) {
		
		Test <Integer> iObj = new Test<Integer>(15); 
		
        System.out.println(iObj.getObject()); 
   
        // instance of String type 
        Test <String> sObj = new Test<String>("manu");
        
        System.out.println(sObj.getObject()); 
    } 
}

		
	