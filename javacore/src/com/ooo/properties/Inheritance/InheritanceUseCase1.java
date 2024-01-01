package com.ooo.properties.Inheritance;

class Vehicle{
	
	String brand;
	String model;
	int year;
	//Usecase1 - no sonctructor in both base class and derived class
	//Usecase2 - Superclass as explicit default constructor, Derived class also have explicit default constructor
	// We are not using the super(); from the drived constructor but still it will work 
	
	/*
	 * In the given code, you have a superclass Vehicle and a subclass Car. The Vehicle class has a default constructor that initializes the brand, model, and year variables to default values. The Car class also has a default constructor that initializes the noOfSeats variable.

When you create an instance of the Car class using the statement Car car = new Car(); in the main method, the following sequence of events occurs:

The default constructor of the Car class is called.

Inside the default constructor of the Car class, there is an implicit call to the default constructor of the superclass (Vehicle in this case) because every constructor implicitly calls the constructor of its superclass as the first statement. This is done to ensure that the state of the superclass is properly initialized before the subclass's constructor body is executed.

Since the Vehicle class has a default constructor that initializes the brand, model, and year variables, these variables are set to their default values when the superclass constructor is implicitly called.

The body of the Car class's constructor executes, initializing the noOfSeats variable.

After the object is created, you print the values of the variables using System.out.println in the main method.
	 */
	public Vehicle(){
		System.out.println("Inside Vehicle Super Class Constructor");
		this.brand="NA";
		this.model="MODEL-NA";
		this.year=0;
				}
	
}


class Car extends Vehicle{
	int noOfSeats;
	//Usecase1 - no sonctructor in both base class and derived class
	
	public Car() {
		System.out.println("Inside Car constructor");
		this.noOfSeats=0;
	}
	
}

public class InheritanceUseCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Usecase1 - no constructor in both base class and derived class it is able access the varibles
		Car car=new Car();
		System.out.println(car.brand);
		System.out.println(car.model);
		System.out.println(car.year);
		System.out.println(car.noOfSeats);
		
		
		

	}

}
