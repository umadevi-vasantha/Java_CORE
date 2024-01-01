package com.ooo.properties.polymorphism;

/*
 * Compile time polymorphism / static binding /Method Overloading
 */

class EmployeeManagementSystem{
	public void addEmployee(int empId, String empName) {
		//Adding Regular employee
		System.out.println("Added Regular Full time Employee "+empName +" Employee ID is "+ empId);
	}
	
	public void addEmployee(int empId, String empName, String depart) {
		//Adding Managerial level Employee with department details
		System.out.println("Added Manager "+empName +" Employee ID is "+ empId+". Working in department"+ depart);
	}
	
	public void addEmployee(int empId, String empName, String project, int contractDuration) {
		//Adding contract employee 
		System.out.println("Added Contract "+empName +" Employee ID is "+ empId+". Working in project"+ project+" With contract duration of "+ contractDuration);
	}
	
	public void addEmployee(int employeeId,String name, int internshipPeriod,String university) {
		//Adding an intern 
        System.out.println("Added Intern: " + name + ", Employee ID: " + employeeId +
                ", University: " + university + ", Internship Period: " + internshipPeriod);
	}
}



public class CompileTimePolymorphism {

	public static void main(String[] args) {
		EmployeeManagementSystem emp= new EmployeeManagementSystem();
		emp.addEmployee(2002, "Hope");
		EmployeeManagementSystem emp2= new EmployeeManagementSystem();
		emp2.addEmployee(2003, "Prakruthi", "ML");
		EmployeeManagementSystem emp3= new EmployeeManagementSystem();
		emp3.addEmployee(2004, "Tejas", "ML-GENAI",3);
		EmployeeManagementSystem emp4= new EmployeeManagementSystem();
		emp3.addEmployee(2005, "Annie", 3,"Universtity of Texas");
		// TODO Auto-generated method stub

	}

}
