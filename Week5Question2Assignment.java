package weeklyassignment;

class Vehicle {
	String brand;
	int speed;
	
	Vehicle(String brand,int speed) {
		this.brand = brand;
		this.speed = speed;		
	}
	
	void display() {
		System.out.println("Brand: " + brand + "\nSpeed: " + speed);
	}
	
	void Run() {
		System.out.println("Vehicle is running");
	}
	
	static String Company;
	static void displayCompany() {
		System.out.println("Company: " + Company);
	}
	
	final void engineType() {
		System.out.println("Engine type: Standard Engine");
	}
}

class Car extends Vehicle {
	String fueltype;
	
	Car(String brand,int speed,String fueltype) {
		super(brand,speed);
		this.fueltype = fueltype;
	}
	
	@Override
	void Run() {
		System.out.println("Car is running smoothly");
	}
	
	// the below lines will cause error if uncommented
	/*	
	@Override
	void engineType() {
		System.out.println("Error: cannot override final method");
	}
	*/	
}

public class Week5Question2Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj = new Vehicle("Hyundai",120);
		obj.display(); 
		
		Car obj1= new Car("Hyundai",120,"Petrol");
		System.out.println("Fuel Type: " + obj1.fueltype);
		obj.Run();
		obj1.Run();
		
		Vehicle.Company = "AutoWorld Ltd";
		Vehicle.displayCompany();
		
		obj.engineType();
		
		// string methods
		String brandname = "Hyundai";
		
		String reversed = new StringBuilder(brandname).reverse().toString();
		System.out.println("Reversed: " + reversed);
		
		String replaced = brandname.replace("u","*").replace("a","*").replace("i","*");
		System.out.println("Replaced: " + replaced);
		
		boolean equals = brandname.equals("Hyundai");
		System.out.println("Equals Hyundai: " + equals);		

	}

}
