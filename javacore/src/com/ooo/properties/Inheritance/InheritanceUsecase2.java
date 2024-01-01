package com.ooo.properties.Inheritance;

/*
 *UC2
If the superclass has a parameterized constructor and no default constructor, 
the subclass constructor must explicitly call a superclass constructor using super with appropriate parameters:

Here are the key points:

Superclass with Default Constructor: If the superclass has a default constructor (no-argument constructor),
 you don't need to explicitly call it in the subclass. The default constructor of the superclass will be implicitly called.

Superclass with Parameterized Constructor (No Default Constructor): If the superclass only has a parameterized constructor
and no default constructor, then in the subclass,you must explicitly call the superclass constructor using super(...) 
in each constructor of the subclass.
 */

class Vehicle1{
	String brand;
	String model;
	int year;
	
	
	
	public Vehicle1(String brand, String model, int year) {
		System.out.println("Inside Vehicle Super Class Parameterized Constructor");
		this.brand = brand;
		this.model= model;
		this.year= year;
	}
}

class Car1 extends Vehicle1{
	int noOfSeats;
//	When you create an instance of the Car1 class with the default constructor (public Car1() { this.noOfSeats = 0; }),
//	it implicitly tries to call the default constructor of the superclass (Vehicle1), which doesn't exist.
////	public Car1() {
//		this.noOfSeats= 0;
//	}
	
	public Car1(String brand, String model, int year,int noOfSeats) {
		super(brand, model,year);
		this.noOfSeats=noOfSeats;
		
		
	}
}
public class InheritanceUsecase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 car= new Car1("HONDA","HONDA_X",2000,4);
		System.out.println(car.brand);
		System.out.println(car.model);
		System.out.println(car.year);
		System.out.println(car.noOfSeats);

	}

}
