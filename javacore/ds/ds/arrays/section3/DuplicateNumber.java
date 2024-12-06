package ds.arrays.section3;

import java.util.Arrays;

/*
 * Duplicate Number
Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)

Example

removeDuplicates({1, 1, 2, 2, 3, 4, 5})
Output : [1, 2, 3, 4, 5]
 */
public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1, 1, 2, 2, 3, 4, 5};
		System.out.println(Arrays.toString(removeDuplicates(myArray)));
		

	}
	
	
		  public static int[] removeDuplicates(int[] arr) {
		    //TODO
			int[] uniqueArray = new int[arr.length];
			int index=0;
			for(int i=0;i<arr.length;i++) {
				boolean isDuplicate = false;
				for(int j=i+1 ;j<arr.length ;j++) {
					if(arr[i]==arr[j]) {
						isDuplicate=true;
						break;
					}
				}
				if(!isDuplicate) {
					uniqueArray[index++]= arr[i];
				}
			}
			
			
			return Arrays.copyOf(uniqueArray, index);
		  }

		}
 
	

