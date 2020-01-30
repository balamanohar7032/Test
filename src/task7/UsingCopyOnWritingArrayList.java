package task7;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class UsingCopyOnWritingArrayList {

	public static void main(String[] args) {
		List<String> myList = new CopyOnWriteArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		myList.add("6");
		myList.add("7");
		myList.remove("4");
		

		System.out.println("List Si" + myList);

		
	}

}

	

