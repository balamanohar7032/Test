package p1;
import java.util.*;

public class CheckerPatteren {
	 public static void checkerboard(int row, int col){
	       for(int i = 1; i<=row; i++){
		       if(i%2 ==0) {
			   System.out.print("  "); 
		       }
			for(int j=1; j<=col; j++) {
			    System.out.print(" # ");
			}
			System.out.println();
		}
	  }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	      System.out.println("Please enter row size");
	      int rowSize = input.nextInt();
	      System.out.println("Please enter columnSize");
	      int colSize = input.nextInt();
	      System.out.println(" the checkerboard pattern\n");
	      checkerboard(rowSize, colSize); 
	   }
	
			}


