package weeklyassignment;

public class Employee {
	int id;
	String name;
	double basicSalary;
	double TotalSalary;
	
	Employee(int id,String name,double basicsalary){
		this.id = id;
		this.name = name;
		this.basicSalary = basicsalary;
	}
	
	void calculateSalary() {
		double HRA = 0.20 * basicSalary;
		double bonus = 0.10 * basicSalary;
		TotalSalary = basicSalary + HRA + bonus;
	}
	
	void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("BasicSalary: " + basicSalary);
		System.out.println("TotalSalary: " + TotalSalary);
	}
	
	

}
