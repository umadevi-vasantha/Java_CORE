package ds.arrays.section3;

/*
 * Finding a Number in an Array
Write a program to to check if an array contains a number in Java.

int[] intArray = {1,2,3,4,5,6};
searchInArray(intArray, 6); // 5
 */
public class SearchValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,2,3,4,5,6};
		System.out.println(searchInArray(intArray, 6));
		

	}
	
	public static int searchInArray(int[] intArray, int valueToSearch) {
		for(int i=0;i<intArray.length;i++) {
			if(valueToSearch==intArray[i]) {
				return i;
			}
		}
		throw new IllegalArgumentException("No Value Found");
	}

}
