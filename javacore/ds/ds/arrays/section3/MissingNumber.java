package ds.arrays.section3;

import java.util.Arrays;

/*
 * Missing Number
Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.

Example

myArray = {1,2,3,4,6}
findMissingNumberInArray(myArray, 6) // 5
Hint:

Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.
 */
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1,2,3,4,6};
		int[] myArray1= {1,2,3,4,5,6,7,8,9,11};
		System.out.println((findMissingNumberInArray(myArray1)));

	}
	
//	public static int findMissingNumberInArray(int[] arr) {
//	       int sum=0;
//	       for(int i=0;i<arr.length;i++){
//	           sum+=arr[i];
//	       }
//	       int n= arr[arr.length-1];
//	       int sumOfn = (n*(n+1))/2;
//	       return sumOfn-sum;
//	    // TODO
//	  }
	
	public static int findMissingNumberInArray(int[] arr) {
		int result=0;
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i+1]!=arr[i]+1) {
				result=arr[i]+1;
				
			}}
			return result;
		}
	}


