package com.ooo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Objects are the instance of the class. And these are real time entity.
		// When an object is created using the "new" keyword, memory is allocated for that object in the heap memory.
		
		//Employee employee; This is called Declaration of an Object; 
		//Declaring an object involves specifying the type of the object and its reference variable
		// Instantiating an object involves creating an actual instance(or object) of a class. This is done using "new" keyword, followed by a call to class constructor
		//When an object is created using the "new" keyword, memory is allocated for the object in the heap memory.
		Employee employee = new Employee();
		//Using default constructor in the above line
		//Compile time = //Runtime time(Dynamic memory allocation happens)
		
		/*
		 * If we instantiate a class without providing values for its fields, the fields will be initialized with default values based on their data types
		 * byte, short, int , long : default value is 0
		 * Boolean Type default value is False
		 * Character  Type : default value is '\u0000'
		 * Object reference will be null
		 */
		//Default values will be printed
		System.out.println("Employee ID"+employee.empId);
		System.out.println("Employee First Name" +employee.empFirstName);
		System.out.println("Employee last Name"+employee.empLastName);
		System.out.println("Employee Gender"+employee.empGender);
		System.out.println("Employee Salary"+employee.empSalary);
		System.out.println("Employee Level"+employee.empLevel);
		employee.start();
		employee.empId=2002;
		employee.empFirstName="Umadevi";
		employee.empLastName="Ravi";
		employee.empGender='F';
		employee.empLevel=11;
		employee.empSalary=40000;
		//Now since we have initialized the fields with values, instead of default values the initialized values will be printed
		System.out.println("Employee ID "+employee.empId);
		System.out.println("Employee First Name " +employee.empFirstName);
		System.out.println("Employee last Name "+employee.empLastName);
		System.out.println("Employee Gender "+employee.empGender);
		System.out.println("Employee Salary "+employee.empSalary);
		System.out.println("Employee Level "+employee.empLevel);
		//Using Parameterized constructor
		Employee employee1 = new Employee(2003 , "Tom" , "Ray" ,50000.0f , 'F', 10);
		System.out.println("Employee ID "+employee1.empId);
		System.out.println("Employee First Name " +employee1.empFirstName);
		System.out.println("Employee last Name "+employee1.empLastName);
		System.out.println("Employee Gender "+employee1.empGender);
		System.out.println("Employee Salary "+employee1.empSalary);
		System.out.println("Employee Level "+employee1.empLevel);
		Employee employee2 = new Employee(2004,"Yash","Raj", 50000.0f ,10);
		System.out.println("Employee ID "+employee2.empId);
		System.out.println("Employee First Name " +employee2.empFirstName);
		System.out.println("Employee last Name "+employee2.empLastName);
		System.out.println("Employee Gender "+employee2.empGender);
		System.out.println("Employee Salary "+employee2.empSalary);
		System.out.println("Employee Level "+employee2.empLevel);
		
        
	}

}
