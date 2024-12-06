package com.core.exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		
		int result=0;
		System.out.println("Enter the first number");
		int num1= sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		
			result=num1/num2;
		}catch(ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero!!");
		}catch(InputMismatchException e) {
			System.out.println("Error: Please enter a valid input");
		}finally {
			sc.close();
			System.out.println("Scanner is closed");
		}

	}

}
