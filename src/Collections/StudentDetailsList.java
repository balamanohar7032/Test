package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class StudentDetailsList {
	
	static List<Student> list=new CopyOnWriteArrayList<Student>();
	public static void main(String[] args) {
		 StudentBussinessLogic stu=new StudentBussinessLogic();
	
		
		 Scanner scanner=new Scanner(System.in);
		
		  list.add(new Student("manohar",23,106));
		  list.add(new Student("venkat",24,107));
		  list.add(new Student("sandeep",25,109));
		  list.add(new Student("chaitanya",26,110));
		  
		  
		  
		  System.out.println(list);
		  
		  System.out.println("enter your choice");
		  String  choice = scanner.next();
		  switch(choice){
		  case "addition":
			  
			  System.out.println("enter student name");
			  String name=scanner.next();
			 
			 
			  System.out.println("enter student age");
			  
			  int age=scanner.nextInt();
			  System.out.println("enter student id");
			  int id=scanner.nextInt();
		List<Student> List = stu.addStudentdetails(name, id, age,list);
			  System.out.println(List);
			  
			  
		  case "deletion":
			  System.out.println("enter id of student  You want to remove ");
			  int id2=scanner.nextInt();
			  
			  List<Student> List1 = stu.removeStudentdetails(id2,list);
			  System.out.println(List1);
			  
			  
		  case "update":
			  
			  System.out.println("enter id of student details You want to update ");
			  int id3=scanner.nextInt();
			  System.out.println("enter student name ");
			  String name1=scanner.next();
			  System.out.println("enter student age");
			  int age1=scanner.nextInt();
			 
			  
			  List<Student> List2 = stu.updateStudentdetails(id3,name1,age1,id3,list );
			  System.out.println(List2);
			  break;
			  
			  default:
				  System.out.println("wrong choice");
			  
			  
			  
			  
				  
		 
			 	  
		  }
		 
	}
}

		 
