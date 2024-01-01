package com.ooo.properties.Inheritance;
/*
 * Employee is the base class with attributes like name and salary.
Manager extends Employee and adds a department attribute.
TeamLead extends Manager and adds a project attribute.
The displayInfo() method is overridden at each level to provide specific information about each type of employee.
The super.displayInfo() calls allow each class to reuse and build upon the functionality of its immediate superclass.
 */

class Employee2{
	int empId;
	double salary;
	
	public Employee2(int empId, double salary) {
		this.empId=empId;
		this.salary=salary;
	}
	
	public void displayInfo() {
		System.out.println("EmpId :"+empId);
		System.out.println("Salary :"+salary);
	}
}

class Manager1 extends Employee2 {
    String department;

    Manager1(int empId, double salary, String department) {
        super(empId,salary);
        this.department = department;
    }

    public void displayInfo() {
        super.displayInfo();  // Calling the displayInfo method of the superclass
        System.out.println("Department: " + department);
    }
}


class TeamLead extends Manager1 {
    String project;

    TeamLead(int empId, double salary, String department, String project) {
        super(empId,salary,department);
        this.project = project;
    }

    public void displayInfo() {
        super.displayInfo();  // Calling the displayInfo method of the immediate superclass (Manager)
        System.out.println("Project: " + project);
    }
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TeamLead teamLead = new TeamLead(10002, 80000, "Engineering", "Project X");
		 teamLead.displayInfo();

	}

}
