package Collections;


import java.util.Map;

public class SuperMarketLogic {
	
	public Map<String,SuperMarket>  addproductdetails(String pid, String pname, double pprize,Map<String,SuperMarket> map) {
		
		map.put(pid,new SuperMarket(pid, pname, pprize));
		
		return map;
	}
	
	public Map<String,SuperMarket>  removeproductdetails(String id2,   Map<String,SuperMarket> map) {
		
		
		 for(Map.Entry<String,SuperMarket> ob:map.entrySet()) {
	    	  
	    	  if(ob.getKey().equals(id2)) {
	    		  
	    		  map.remove(id2);
	    	  }
	      }
	    	  
	      return map;
	
	}
	
	public Map<String,SuperMarket>  updateproductdetails(String pid2,String pname, double pprize,   Map<String,SuperMarket> map) {
		
		
		 for(Map.Entry<String,SuperMarket> ob:map.entrySet()) {
	    	  
	    	  
	    	  if(ob.getKey().equals(pid2)) {
	    		  map.replace(pid2,new SuperMarket(pid2,pname,pprize));
	    	  }
	      }
	    	  
	      
			return map;
	
	}
}

	


