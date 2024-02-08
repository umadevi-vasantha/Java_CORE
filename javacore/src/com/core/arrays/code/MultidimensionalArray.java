package com.core.arrays.code;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration and Initialization of a 2D array with literals
		int[][] my2DArray = {
				{1,2,3},
				{5,6,4},
				{8,9,10}
		};
		
		//Accessing individual elements of the array using indicies.
		int element = my2DArray[0][1];
		System.out.println(element);
		System.out.println(my2DArray.length);
		// Printing the arrays using for loop
		for (int i=0 ; i<my2DArray.length; i++) {
			for(int j=0 ; j<my2DArray[i].length;j++) {
				System.out.println(my2DArray[i][j]);
			}
		}
		
		Scanner sc= new Scanner(System.in);
		int[][] arr = new int[2][];
		System.out.println("Scanning");
		for (int i=0 ; i<arr.length; i++) {
			System.out.print("Enter the number of columns");
			int col=sc.nextInt();
			arr[i] = new int[col];
			System.out.println("Col:"+arr[i]);
			
			for(int j=0 ; j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();			}
			
		}
		System.out.println("Printing");
		for (int i=0 ; i<arr.length; i++) {
			for(int j=0 ; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");			}
			System.out.println();
			
		}
		
		System.out.println("Printing using Tostring");
		for(int row=0 ; row<arr.length;row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
		
		System.out.println("Printing using enhanced for loop");
		for (int[] a: arr) {
			System.out.println(Arrays.toString(a));
		}

		
		
	}

}
