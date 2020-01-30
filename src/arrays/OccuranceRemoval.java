package arrays;

import java.util.Arrays;

public class OccuranceRemoval {
	public static int[] removeElements(int[] arr, int key) 
    { 
           
          int index = 0; 
          for (int i=0; i<arr.length; i++) 
             if (arr[i] != key) 
                arr[index++] = arr[i]; 
  
         return Arrays.copyOf(arr, index); 
    } 

	public static void main(String[] args) {
		int[] array = {2,6,8,3,2,4,8,2}; 
        int key = 2; 
        array = removeElements(array, key); 
        System.out.println(Arrays.toString(array));

	}

}
