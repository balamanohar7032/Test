package com.junittest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.jupiter.api.Test;
import com.junitclass.SuperMarketLogic1;
import Collections.SuperMarket;

public class SuperMarketlogicTest {
	
	SuperMarketLogic1 sml=new SuperMarketLogic1();
	
	@Test
	public void addProductdetailsTest() {
		
		 
         Map<String,SuperMarket> expected=new ConcurrentHashMap<String,SuperMarket>();
		
       expected.put("milk", new SuperMarket("milk","heritage",22));
       expected.put("rice", new SuperMarket("rice","masoora",55));
       expected.put("chillipowder", new SuperMarket("chillipowder","ashirvad",25));
		  
        Map<String,SuperMarket>  actual = sml.addproductdetails("veg", "tomato", 21.0, expected);
		   assertEquals(expected,actual);	
	}
	@Test
	public void removeProductdetailsTest() {
		Map<String,SuperMarket> expected1=new ConcurrentHashMap<String,SuperMarket>();
		
	       expected1.put("milk", new SuperMarket("milk","heritage",22));
	       expected1.put("rice", new SuperMarket("rice","masoora",55));
	       expected1.put("chillipowder", new SuperMarket("chillipowder","ashirvad",25));
			  
	       Map<String,SuperMarket>  actual1 = sml.removeproductdetails("milk",expected1);
		  
		  assertEquals(expected1,actual1);
		  }
	@Test
	public void updateProductdetailsTest() {
		Map<String,SuperMarket> expected2=new ConcurrentHashMap<String,SuperMarket>();
		
	       expected2.put("milk", new SuperMarket("milk","heritage",22));
	       expected2.put("rice", new SuperMarket("rice","masoora",55));
	       expected2.put("chillipowder", new SuperMarket("chillipowder","ashirvad",25));
	       Map<String,SuperMarket> actual2 = sml.updateproductdetails("milk","amul",21, expected2);
		  
		  assertEquals(expected2,actual2);	
		
		  
	}
	
	

}
