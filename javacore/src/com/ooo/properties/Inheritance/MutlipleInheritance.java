package com.ooo.properties.Inheritance;
//Diamond Problem 
/*
 * Multiple inheritance can lead to a scenario known as the "diamond problem."
The diamond problem occurs when a class inherits from two classes that have a common ancestor.
It creates ambiguity in method resolution when the common ancestor's method is overridden in both parent classes.
 */

class Employee{
	String empId;
	
	public void displayInfo() {
		System.out.println("EmployeeId ::"+ empId);
	}
}

class Manager extends Employee{
	String department;
	@Override
	public void displayInfo() {
		System.out.println("Manager::"+ empId +"department::"+department);
		
	}
}

class SalesPerson extends Employee{
	String territory;
	@Override
	public void displayInfo() {
		System.out.println("Sales person::"+empId+"Territoty::"+territory);
	}
}
//
//class SalesManager extends Manager, Salesperson {
//    // Compilation error: Multiple inheritance not allowed in Java
//}
public class MutlipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager= new Manager();
		manager.empId= "Uma";
		manager.department="ML-AI";
		

	}

}
