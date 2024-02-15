package com.core.arrays.code;
///find the number of values with even number of digits in it
// like 45 678 9000 : in this 45 and 9000 has 2 and 4 digit count
public class FindEvenDigitsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23, 3545, 7 ,987, 90909, 989890, 76767878};
		int count = findCount(arr);
		System.out.println("Total count of even number digits in array"+count);

	}

	
	static int findCount(int[] arr) {
		int count=0;
		for(int value : arr) {
			if(even(value)) {
				count++;
				
			}
			
		}
		return count;
	}
	
	static boolean even(int value) {
		int numberOfDigits = digits(value);
		return numberOfDigits%2 ==0;
	}
	
	static int digits(int value) {
		int count=0;
		if (value <0) {
			value =value * -1;
		}
		
		if(value ==0 ) {
			return 1;
		}
		while(value >0) {
			count++;
			value =value/10;
		}
		return count;
	}
	
}

