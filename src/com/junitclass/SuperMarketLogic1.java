package com.junitclass;

import java.util.Map;

import Collections.SuperMarket;

public class SuperMarketLogic1 {
public Map<String,SuperMarket>  addproductdetails(String pid, String pname, double pprize,Map<String,SuperMarket> expected) {
		
	expected.put(pid,new SuperMarket(pid, pname, pprize));
		
		return expected;
	}
	
	public Map<String,SuperMarket>  removeproductdetails(String id2,   Map<String,SuperMarket> expected1) {
		
		
		 for(Map.Entry<String,SuperMarket> ob:expected1.entrySet()) {
	    	  
	    	  if(ob.getKey().equals(id2)) {
	    		  
	    		  expected1.remove(id2);
	    	  }
	      }
	    	  
	      return expected1;
	
	}
	
	public Map<String,SuperMarket>  updateproductdetails(String pid2,String pname, double pprize,   Map<String,SuperMarket> expected2) {
		
		
		 for(Map.Entry<String,SuperMarket> ob:expected2.entrySet()) {
	    	  
	    	  
	    	  if(ob.getKey().equals(pid2)) {
	    		  expected2.replace(pid2,new SuperMarket(pid2,pname,pprize));
	    	  }
	      }
	    	  
	      
			return expected2;
	
	}
}



