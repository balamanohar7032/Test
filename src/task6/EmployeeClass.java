package task6;

public class EmployeeClass {
	 String empName;
	 

	int empNo;
	 double empSalary;
	 public EmployeeClass(String empName,int empNo,double empSalary) {
		 this.empName=empName;
		 this.empNo=empNo;
		 this.empSalary=empSalary;
	 }
	 @Override
		public String toString() {
			return "EmployeeClass [empName=" + empName + ", empNo=" + empNo + ", empSalary=" + empSalary + "]";
		}

	public static void main(String[] args) {
		EmployeeClass ob=new EmployeeClass("manohar",24,12000.00);
		System.out.println(ob);
		
	}

}
