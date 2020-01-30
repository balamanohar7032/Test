package Collections;

public class Student {
	
	String name;
	int age;
	 public int id;
	 public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
	
	 

}
