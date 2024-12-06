package ds.arrays.section3;

/*
 * 
 * Create a function which prints to the console the pairs of the given array
 * find the time complexity for the method
 */

public class ArrayPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] array = {1,2,3,4,5,6,7};
		pairMethod(array);
	}
	//Time complexity: O(N^2)
	public static void pairMethod(int[] array) {
		for(int i=0;i<array.length; i++) { 
			for (int j=0;j<array.length;j++) { //Two For loops o(n2)
				System.out.println(array[i]+","+array[j]);//O(1)
			}
		}
	}
}
