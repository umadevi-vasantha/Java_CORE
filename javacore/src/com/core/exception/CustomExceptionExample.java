package com.core.exception;

import java.util.Scanner;


public class CustomExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person();
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter the first name:");
			p1.setFirstName(sc.nextLine());
			System.out.println("enter the second name:");
			p1.setLastName(sc.next());
			System.out.print("enter the age");
			p1.setAge(sc.nextInt());
			
			
				p1.checkAgeEligibility(p1.getAge());
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		

	}

}

class Person{
	String FirstName;
	String LastName;
	int age;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void checkAgeEligibility(int age) throws InvalidAgeException {
		if(age <18) {
		throw new InvalidAgeException("Age is invalid");}
		else {
			System.out.println("You are eligible to vote!!");
		}
	}
}

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
}
}
	

