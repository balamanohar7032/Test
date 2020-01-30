package arrays;
public class AddingElement {
	public static int[] addElement(int n, int arr[], int x) 
    { 
        
  int newarr[] = new int[n + 1]; 
 
        for (int i = 0; i < n; i++) 
            newarr[i] = arr[i]; 
  
        newarr[n] = x; 
  
        return newarr; 
    } 

	public static void main(String[] args) {
		int n = 5; 
         int arr[] 
            = { 1, 2, 3, 4, 5}; 
        System.out.println("before adding element");
        for (int j = 0; j < arr.length; j++) {
        	
        	 System.out.print( arr[j]+","); 

			
		}  System.out.println();
        
     int x = 10; 
  
    arr = addElement(n, arr, x); 
    
    System.out.println("after adding element"); 
    for (int j = 0; j < arr.length; j++) {
    	
   	 System.out.print(arr[j]+","); 

		
	}
   
                           
                           
		
	}

}
