package task6;

import java.util.Comparator;

public class Sortbyname implements Comparator<Employee> {


	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.empName.compareTo(o2.empName); 
	}

}
