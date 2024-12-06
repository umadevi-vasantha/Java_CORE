package ds.arrays.section3;

/*
 * Middle Function
Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

myArray = [1, 2, 3, 4]
middle(myArray)  # [2,3].
 */
import java.util.Arrays;

public class MiddleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6};
		int[] array2 = {1,2};
		Arrays.toString(middle(array));
		Arrays.toString(middle(array2));

	}
	
	public static int[] middle(int[] array) {
		if(array.length <=2) {
			return new int[0];
		}else {
			int[] middle= new int[array.length-2];
			for(int i=0; i< array.length-2;i++) {
				middle[i]=array[i+1];
			}
			System.out.println(Arrays.toString(middle));
			return middle;
		}
	}

}
