package com.ooo;

// Class is named group of properties and Methods.
// Class is a logical entity where as object is real time entity
public class Employee {
	
	int empId;
	String empFirstName;
	String empLastName;
	float empSalary;
	char empGender;
	int empLevel;
	
	/*
	 * 1.Constructor  is a Special methods that is called when a object is created , Its Purpose is to initialize the object's state or perform any
	 * set up that is required for the object to be in a valid and usable state.
	 * 2. Constructor have the same name as the class and do not return a return type, not even void
	 * 3.Default Constructor : A default constructor is a constructor that takes no parameters.
	 * If we don't explicit define any constructor in your class, Java provides a default constructor for us. The default constructor initalizes the fields of the 
	 * objects with their default values.
	 * primary use of Deafult constructor is to ensure that object has valid initial state even if the user doesn't provide any specific value during thr object insatntiation.
	 * 
	 *Note : If we have'nt define any constructor in our class, Java automatically provides a default constructor,However
	 *If we add a parameterized constructor in our class, the default constructor is not automatically generated. Defining it explicitly becomes necessary if you still
	 *want to option creating objects without providing specific values.
	 */
	public Employee() {
		System.out.print("Inside Default constructor");
//		this.empId= 0;
//		this.empFirstName = "NA";
//		this.empLastName="NA";
//		this.empSalary=0.0f;
//		this.empGender='N';
//		this.empLevel=0;
		//uncomment this lines and calling the using constructor while object instantiation will assign these default values explicitly mentioned by the user
	}
	
	public Employee(int id, String fName , String LName , float salary, char gender, int level ) {
		System.out.println("Inside Parameterized constructor");
		this.empId=id;
		this.empFirstName=fName;
		this.empLastName=LName;
		this.empSalary=salary;
		this.empGender=gender;
		this.empLevel=level;
		
		
	}
	//Constructor Overloading 
	//if we want to allow skipping a paramter ina constructor and assign default value to it, you can achive this by overloading constructor
//Un comment these lines
	//	public Employee(int id, String fName , String LName , float salary,  int level ) {
//		System.out.println("Inside Parameterized constructor");
//		this.empId=id;
//		this.empFirstName=fName;
//		this.empLastName=LName;
//		this.empSalary=salary;
//		this.empGender='N';
//		this.empLevel=level;
//		
//		
//	}
	//Constrcutor chaining involves callign one constructor from another within same class. This allows you to reuse code and maintain a consitenet initialization process 
	public Employee(int id, String fName , String LName , float salary,  int level ) {
		this(id,fName,LName,salary,'N',level);
		System.out.println("Inside Constrcutor Chaining block");
		
	}
	
	public void start() {
		System.out.println("Inside the Employee Class");
	}

}
