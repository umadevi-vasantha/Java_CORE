package com.ooo.properties.Inheritance;

class Employee_1{
    String name;
    double salary;

    Employee_1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager_1 extends Employee_1 {
    String department;

    Manager_1(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayInfo() {
        super.displayInfo();  // Calling the displayInfo method of the superclass
        System.out.println("Department: " + department);
    }
}

class Worker extends Employee_1 {
    String shift;

    Worker(String name, double salary, String shift) {
        super(name, salary);
        this.shift = shift;
    }

    void displayInfo() {
        super.displayInfo();  // Calling the displayInfo method of the superclass
        System.out.println("Shift: " + shift);
    }
}

public class HierarchialInheritance {
    public static void main(String[] args) {
        Manager_1 manager = new Manager_1("John Doe", 80000, "Engineering");
        Worker worker = new Worker("Jane Smith", 50000, "Day Shift");

        manager.displayInfo();
        System.out.println();
        worker.displayInfo();
    }
}
