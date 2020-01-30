package task6;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String,Integer> ob=new HashMap<String,Integer>();
		ob.put("manohar", 101);
		ob.put("sanjay",102 );
		ob.put("avinash",103 );
		ob.put("krishna",104);
		  for(Map.Entry e:ob.entrySet()){    
		       System.out.println("empname="+e.getKey()+"    empId= "+e.getValue());    
		      }  
	}

}
 