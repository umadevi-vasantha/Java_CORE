package ds.arrays.section3;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray = {1,2,3,4,5,6,7,8,9,10};
		reverseArray(myarray);

	}

	// Time complexity : O(N) ; N/2 ( 2 is constant; ignore)
	public static void reverseArray(int[] array) {
		for(int i=0; i< array.length/2; i++) {
			int last= array.length-i-1;
			int temp =array[i];
			array[i]=array[last];
			array[last]=temp;
			
		}
		System.out.println(Arrays.toString(array));
	}
}
