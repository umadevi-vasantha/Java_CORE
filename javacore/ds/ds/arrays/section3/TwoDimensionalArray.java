package ds.arrays.section3;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//Declare, Instantiate, initialize
		int[][] array2d;
		array2d= new int[2][3];
		array2d[0][0] = 0;
		array2d[0][1] =1;
		array2d[0][2]=2;
		array2d[1][0]=3;
		array2d[1][1]=4;
		array2d[1][2]=5;
		System.out.println(Arrays.deepToString(array2d));
		
		String[][] s2d= { {"a","b"},{"c","d"}};
		System.out.println(Arrays.deepToString(s2d));
		
		TwoDimensionalArray1 arr2d= new TwoDimensionalArray1(2,3);
		arr2d.insert2d(0, 0, 2);
		arr2d.insert2d(0, 1, 4);
		arr2d.insert2d(0, 2, 6);
		arr2d.insert2d(1, 0, 8);
		arr2d.insert2d(1, 1, 9);
		arr2d.insert2d(1, 2, 10);
		arr2d.insert2d(1, 2, 10);
		arr2d.insert2d(1, 3, 10);
		
		//access
		arr2d.accessingelement(0, 2);
		arr2d.accessingelement(1, 3);
		// traverse
		arr2d.traverse();
		arr2d.search(9);
	}
}
