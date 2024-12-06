package ds.arrays.section3;

/*
 * 2D Arrays
Given 2D array calculate the sum of diagonal elements.

Example

myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
 
sumDiagonalElements(myArray2D) # 15
 */
public class SumOfDiagonalElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{0,1,2},{3,4,5},{6,7,8}};
		System.out.println(sumDiagonalElements(array));

	}
	
	public static int sumDiagonalElements(int[][] array) {
  	  int sumOfDiagonal=0;
        for(int i=0;i<array.length;i++) {
      	  sumOfDiagonal+= array[i][i];
        }
        return sumOfDiagonal;
  }

	
	
//	      public static int sumDiagonalElements(int[][] array) {
//	    	  int sumOfDiagonal=0;
//	          for(int i=0;i<array.length;i++) {
//	        	  for(int j=0;j<array[0].length;j++) {
//	        		  if(i==j) {
//	        			  sumOfDiagonal += array[i][j];
//	        		  }
//	        	  }
//	          }
//	          return sumOfDiagonal;
//	    }
	
}
