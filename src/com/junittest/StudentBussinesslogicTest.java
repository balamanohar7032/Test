package com.junittest;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.junit.jupiter.api.Test;


import com.junitclass.StudentBussinesslogic1;

import Collections.Student;



class StudentBussinesslogicTest {
	StudentBussinesslogic1 st1=new StudentBussinesslogic1();

	@Test
	public void addStudentdetailsTest() {
		 
		List<Student> expected=new ArrayList<Student>();
		  expected.add(new Student("manu",23,110));
		  expected.add(new Student("sandy",24,111));
		  
		  expected.add(new Student("mahi",22,106));
		  
		   List<Student>  actual = st1.addStudentdetails("manu", 107, 12, expected);
		   assertEquals(expected,actual);	
	}
	@Test
	public void removeStudentdetailsTest() {
		List<Student> expected1=new CopyOnWriteArrayList<Student>();
		  expected1.add(new Student("manohar",23,101));
		  expected1.add(new Student("sandeep",24,102));
		  
		  
		  expected1.add(new Student("venkat",25,105));
		  
		  List<Student> actual1 = st1.removeStudentdetails(102,expected1);
		  
		  assertEquals(expected1,actual1);
		  }
	@Test
	public void updateStudentdetailsTest() {
		List<Student> expected2=new CopyOnWriteArrayList<Student>();
		  expected2.add(new Student("manohar",23,101));
		  expected2.add(new Student("sandeep",24,102));
		  
		  expected2.add(new Student("venkat",25,105));
		  
		  List<Student> actual2 = st1.updateStudentdetails(102,"mahi",32,10, expected2);
		  
		  assertEquals(expected2,actual2);	
		
		  
	}
	
	
	
	
}
