package com.junitclass;

import java.util.Iterator;
import java.util.List;

import Collections.Student;

public class StudentBussinesslogic1 {
	   
	public List<Student>  addStudentdetails(String name, int id, int age, List<Student> expected) {
		expected.add(new Student(name, age, id));
		return expected;
	}
	public List<Student>  removeStudentdetails(int id2,  List<Student> expected1) {
		
		
		
        Iterator<Student> it=expected1.iterator(); 
        int temp=0;
         while(it.hasNext()) {
        	 
        	 if(it.next().id==id2) {
				
        		 
        		 
				 expected1.remove(temp);
				 
				
			}temp++;
		}

         return expected1;
	}
	public List<Student> updateStudentdetails(int id3,String name1,int age1,int id,List<Student> expected2) {
		 Iterator<Student> it=expected2.iterator(); 
	        int temp=0;
	         while(it.hasNext()) {
	        	 
	        	 
				if(it.next().id==id3) {
					
					expected2.set(temp,new Student(name1, age1, id3));
					
				}temp++;
			}

		return expected2;
		
	}
	
}



