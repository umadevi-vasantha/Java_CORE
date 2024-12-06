package ds.arrays.section3;

/*
 * Max Product of Two Integers
How to find maximum product of two integers in the array where all elements are positive.

Example

int[] intArray = {10,20,30,40,50};
maxProduct(intArray) // (40,50)
 */
public class maxProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {10,20,30,40,50};
		System.out.println(maxProduct(intArray));

	}
	
	public static String maxProduct(int[] intArray) {
        // TODO
	int maxProduct=0;
	String pairs="";
	for(int i=0;i<intArray.length;i++) {
		for(int j=i+1; j<intArray.length;j++ ) {
			if(intArray[i]*intArray[j]>maxProduct) {
				maxProduct= intArray[i]*intArray[j];
				pairs=intArray[i]+","+intArray[j];
			}
		}
	}
	return pairs;
        
    }

}
