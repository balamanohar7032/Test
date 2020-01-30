package Collections;

import java.util.Iterator;
import java.util.List;

public class StudentBussinessLogic {
	

	
	public List<Student>  addStudentdetails(String name, int id, int age, List<Student> list) {
		list.add(new Student(name, age, id));
		return list;
	}
	public List<Student>  removeStudentdetails(int id2,  List<Student> list) {
		
		
		
      /* list.removeIf(Student->Student.id==id2);*/
		
        Iterator<Student> it=list.iterator(); 
        int temp=0;
         while(it.hasNext()) {
        	 
        	 
			if(it.next().id==id2) {
				
				
				 list.remove(temp);
				 
				
			}temp++;
		}


		
		return list;
	}
	public List<Student> updateStudentdetails(int id3,String name1,int age1,int id1, List<Student> list) {
		 Iterator<Student> it=list.iterator(); 
	        int temp=0;

	        	 
	        	 
				if(it.next().id==id3) {
					
					list.set(temp,new Student(name1, age1, id3));
					
				}temp++;
			

		
		
		
		
				return list;
		
	}
	

}
