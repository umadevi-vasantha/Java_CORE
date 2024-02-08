package com.core.arrays.code;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {

    public static void main(String[] args) {
    	
    	//In situation where the size of the array and variables of the array are already known, array literals can be used
    	//Declaring array literal
    	int[] intArray = {1,2,3,4,5,6};
    	for (int arr2 : intArray) {

   
    	System.out.println(arr2);
    	}
    		
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array");

        int[] arr = new int[5];
        // Reading the Array
        System.out.println("Printing using for loop");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // printing the array
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.print("Printing using for each loop");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println("Printing using toString method");
        System.out.println(Arrays.toString(arr));

        System.out.println("Using for each with lambda");
        Arrays.stream(arr).forEach(number -> System.out.print(number + " "));
        square(arr);
    }

    public static void square(int[] arr) {
        // Implementation of the square method
        // You can square each element in the array and print or do any other operation
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }

        System.out.println("\nPrinting array after squaring each element");
        System.out.println(Arrays.toString(arr));
    }
}
