package com.ooo.properties.Inheritance;

/*
 * UC3 : Calling Superclass Constructor from Multiple Constructors:
In a subclass, you might have multiple constructors, and each can call a different superclass constructor:
 */

class Vehicle2{
	
	String brand;
	String model;
	int year;
	
	
	public Vehicle2() {
		System.out.println("This is Default Super Class COnstructor");
	}
	public Vehicle2(String brand, String model) {
		System.out.println("Inside Vehicle Super Class Parameterized Constructor1");
		this.brand = brand;
		this.model= model;
		
	}
	
	
	public Vehicle2(String brand, String model, int year) {
		System.out.println("Inside Vehicle Super Class Parameterized Constructor2");
		this.brand = brand;
		this.model= model;
		this.year= year;
	}
	
	public Vehicle2(Vehicle2 vehicle) {
		System.out.println("Inside Vehicel Object COnstructor");
		this.brand=vehicle.brand;
		this.model=vehicle.model;
		this.year=vehicle.year;
	}
	

}

class Car2 extends Vehicle2{
	int noOfSeats;
	
	public Car2(){
		System.out.println("This is car default constructor");
	}
	
	public Car2(String brand, String model, int noOfSeats) {
		super(brand, model);
		this.noOfSeats=noOfSeats;
	}
	
	public Car2(String brand, String model, int year,int noOfSeats) {
		super(brand, model,year);
		this.noOfSeats=noOfSeats;
	}
	
	public Car2(Car2 car) {
		
		super(car);
		this.noOfSeats=noOfSeats;
		System.out.println("Inside Car Object COnstructor");
	}
	
	
}
public class InheritanceUsecase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car2 car=new Car2();
		System.out.println(car.brand);
		System.out.println(car.model);
		System.out.println(car.year);
		System.out.println(car.noOfSeats);
		Vehicle2 veh= new Car2();
		System.out.println(veh.brand);
		System.out.println(veh.model);
		System.out.println(veh.year);
	/*
	 * When you create an instance of Car2 using Vehicle2 veh = new Car2();,
	 *  you are using polymorphism, and the reference variable veh is of type Vehicle2. 
	 *  The compiler treats veh as a Vehicle2 reference, so you can only access members of the Vehicle2 class.
	 *  The noOfSeats variable is not accessible directly through veh, resulting in a compilation error.
	 */
	//System.out.println(veh.noOfSeats);
		System.out.println(((Car2) veh).noOfSeats);  // Output: 0
		veh=new Car2("HONDA","HONDA_D",2003,8);
		System.out.println(veh.brand);
		System.out.println(veh.model);
		System.out.println(veh.year);
		System.out.println(((Car2) veh).noOfSeats);
		car=new Car2((Car2)veh);
		System.out.println(car.brand);
		System.out.println(car.model);
		System.out.println(car.year);
		System.out.println(car.noOfSeats);
		
		
		
		
		
		

	}

}
