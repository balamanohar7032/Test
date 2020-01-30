package task6;

import java.util.Comparator;

public class Employee implements Comparator<Employee>,Comparable<Employee> {
	int empNo;
    String empName;
    double empSal;
  public Employee(int empNo, String empName, double empSal) {
      super();
      this.empNo = empNo;
      this.empName = empName;
      this.empSal = empSal;
  }
  

 public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


public int getEmpNo() {
	return empNo;
}

public void setEmpNo(int empNo) {
	this.empNo = empNo;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public double getEmpSal() {
	return empSal;
}

public void setEmpSal(double empSal) {
	this.empSal = empSal;
}

@Override
public int compareTo(Employee o) {
	
	return this.empName.compareTo(o.empName);
	
	
}

@Override
public int compare(Employee o1, Employee o2) {
	return o1.empName.compareTo(o2.empName); 
}

@Override
public String toString() {
	return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + "]";
}


}
 





