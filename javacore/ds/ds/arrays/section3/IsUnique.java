package ds.arrays.section3;

/*
 * IsUnique / Contains Duplicate - LeetCode 217
Write a program to check if an array is unique or not.

Example

int[] intArray = {1,2,3,4,5,6};
isUnique(intArray) // true
 */
public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,2,3,4,4,5,6};
		System.out.println(isUnique(intArray));

	}

	public static boolean isUnique(int[] intArray) {
        // TODO
		//boolean isUnique = true;
		for(int i=0;i<intArray.length;i++) {
			for(int j=i+1;j<intArray.length;j++) {
				if(intArray[i]==intArray[j]) {
					return false;
					
				}
				
			}
			
		}
		return true;
    }
	
	
}
