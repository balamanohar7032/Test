package p1;

public class Reverse {
	

	public static void main(String[] args) {

		String input = "balamanohar";

		String s2="";
		
		for(int i=input.length()-1;i>=0;i--) {
			s2=s2+input.charAt(i);
			
		}System.out.println("the reverse of a string is: "+s2);

}
}
