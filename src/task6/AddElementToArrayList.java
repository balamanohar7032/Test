package task6;

import java.util.ArrayList;

public class AddElementToArrayList {

	public static void main(String[] args) {
		ArrayList<String> ob = new ArrayList<String>( );
		ob.add("mahi");
		ob.add("manu");
		ob.add("bala");
		
		
        
        System.out.println(ob);  
         
        
        ob.add(2, "Lokesh");//adding element at index 2
         
        System.out.println(ob);  

	}

}
