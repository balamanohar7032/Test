package task6;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayListUsingComp {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
       
        list.add(new Employee(101, "Vijay", 23000.00));
        list.add(new Employee(106, "Ajay", 27777.90));
        list.add(new Employee(105, "Jai", 21006.00));
            Collections.sort(list);
            System.out.println("sort by empName using comparable"+list);
        
 
        Collections.sort(list, new Employee());
       System.out.println("Sort by empName using comparator"+list);
       
    
}
}
