package ds.arrays.section3;

import java.util.Arrays;

public class SingleDimesionalArray {
	int[] arr =null;

	public SingleDimesionalArray(int sizeOfArray) {
		arr =new int[sizeOfArray];
		for(int i=0;i<sizeOfArray; i++) {
			arr[i]=Integer.MIN_VALUE;
		}
	}
	
	public void insertArray(int index, int value) {
		try {
		if(arr[index]==Integer.MIN_VALUE) {
			arr[index]=value;
			System.out.println("Successfully Inserted");
			System.out.println(Arrays.toString(arr));
		}else {
			System.out.println("Value exist in this cell");
			System.out.println(Arrays.toString(arr));
		}}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bound");
			
		}
	}
	//Traversal of Array
	//Space complexity : O(1)
	//Time complexity : O(N)
	public void traversalOfArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//Search in Array
	//Linear Search
	//Time complexity : O(N)
	//Space complecity : 
	public void searchArray(int[] arr , int searchvalue) {
		for(int i=0;i< arr.length;i++) {
			if(arr[i]==searchvalue) {
				System.out.println("Element found at "+ i);
				return;
			}
				
		}
		System.out.println("Element not found");
	}
	
	

}
