package task6;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOfArrayList {

	public static void main(String[] args) {
		ArrayList<String> ob = new ArrayList<String>( );
	    ob.add("manu");
		ob.add("bala");
		ob.add("srikanth");
		ob.add("mahi");
		System.out.println("before reversing");
		System.out.println(ob);
		
		Collections.reverse(ob); 
		System.out.println("after reversing");
		System.out.println(ob);
		
		
		
		
		
	}

}
