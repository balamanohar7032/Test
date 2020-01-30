package task7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FixingConcurrentModificationException {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

for(int i = 0; i<myList.size(); i++){
			System.out.println(myList.get(i));
			if(myList.get(i).equals("3")){
				myList.remove(i);
				
				myList.add("6");
			}
		}

		


	}

}
