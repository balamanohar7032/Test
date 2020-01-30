package Collections;



import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class SuperMarketProducts {

	public static void main(String[] args) {
		
		
	Scanner scanner=new Scanner(System.in);
	 SuperMarketLogic stl=new  SuperMarketLogic();
		
	
		Map<String,SuperMarket> map=new ConcurrentHashMap<String,SuperMarket>();
		
		map.put("milk", new SuperMarket("milk","heritage",22));
		map.put("rice", new SuperMarket("rice","masoora",55));
		map.put("chillipowder", new SuperMarket("chillipowder","ashirvad",25));
		 System.out.println(map);
		 
		 
		 System.out.println("enter your choice");
		  String  choice = scanner.next();
		  switch(choice){
		  case "insert":
			  
			  System.out.println("enter product id");
			  String pid=scanner.next();
			 
			 
			  System.out.println("enter productname");
			  String pname=scanner.next();
			  System.out.println("product prize");
			  double pprize=scanner.nextDouble();
		Map<String,SuperMarket> Map = stl.addproductdetails(pid, pname, pprize,map);
			  System.out.println(Map);
			  
			  
         case "delete":
			  
			  System.out.println("enter product id");
			  String pid1=scanner.next();
			 
			 
			 
		Map<String,SuperMarket> Map1 = stl.removeproductdetails(pid1, map);
			  System.out.println(Map1);
			  
		  
			  
				  
			  case "update":
				  
				  System.out.println("enter product id you to update");
				  String pid2=scanner.next();
				 
				 
				  System.out.println("enter productname");
				  String pname1=scanner.next();
				  System.out.println("product prize");
				  double pprize1=scanner.nextDouble();
			Map<String,SuperMarket> Map2 = stl.updateproductdetails(pid2, pname1, pprize1,map);
				  System.out.println(Map2);
				  break;
			  default:
				  System.out.println("wrong choice");
			
			  
			  
			  
		 

	}

}
}
