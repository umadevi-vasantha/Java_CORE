package ds.arrays.section3;

public class TwoDimensionalArray1 {
	int[][] arr=null;
	
	public TwoDimensionalArray1(int noOfRows, int noOfCol) {
		this.arr = new int[noOfRows][noOfCol];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=Integer.MIN_VALUE;
		}
	}
	}
//inserting elements
	//time complexity: O(1)
	//space complexity : O(1)
	public void insert2d(int row, int col, int value) {
		try {
			if(arr[row][col]==Integer.MIN_VALUE) {
				arr[row][col]=value;
				System.out.println("Element Inserted");
			}
			else {
				System.out.println("Elements already found");
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" Index out of bound");
		}
		
	}
	//Accessing element
	// Time complexity : O(1)
	// Space complexity: O(1)
	public void accessingelement(int row, int col) {
		System.out.println("Accessing elements at row : "+ row + "column :"+col);
		try {
			System.out.println(arr[row][col]);
		}catch( ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of Bound");
		}
	}
	
	//Traversing elements
	//Time complexity : O(N^2)
	//Space complexity: O(1)
	public void traverse() {
		for(int i=0; i<arr.length;i++) {
			for(int j=0 ; j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("***");
		}
	}
	
	//Searching elements
	//Time complexity : O(N^2)/ O(M)(N)
	//space complexity : O(1)
	public void search(int value) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==value) {
					System.out.println("Element found at row:"+i + "column:"+ j);
					return;
				}
			
			}
			System.out.println("Element not found in array");
		}
	}
	}
