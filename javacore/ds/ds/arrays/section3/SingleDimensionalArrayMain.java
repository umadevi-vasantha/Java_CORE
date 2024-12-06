package ds.arrays.section3;

import java.util.Arrays;

public class SingleDimensionalArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleDimesionalArray arr= new SingleDimesionalArray(10);
		arr.insertArray(0, 1);
		arr.insertArray(11, 0);
		arr.insertArray(2, 3);
		arr.insertArray(0,2);
		/*
		 * In Java 'var' is a keyword introduced in Java 10 as part of Project Amber.
		 * It allows for local variable type inference, which means you can declare a variable without explicitly stating its data type
		 * Instead, the compiler infer the type of the variable based on the type of the expression on the right-hand of the assignment.
		 */
		//Accessing the elements
		var firstelement = arr.arr[0];
		System.out.println("FirstElement"+ firstelement);
		var secondelement =arr.arr[1];
		System.out.println("Second Elemet "+ secondelement);
		arr.traversalOfArray(arr.arr); 
		
		//Search result
		arr.searchArray(arr.arr, 2);
		
	}

}
