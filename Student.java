package weeklyassignment;

public class Student extends Person{
	int marks;
	
	Student(String name,int age,int marks){
		super(name,age);
		this.marks = marks;
	}
	
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Marks: " + marks);
	}
	
	

}
