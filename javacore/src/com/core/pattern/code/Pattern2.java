package com.core.pattern.code;

/*
 
==========PATTERN 3=========
# # # # # 

# # # # 

# # # 

# # 

# 

==========PATTERN 4=========
1 

1 2 

1 2 3 

1 2 3 4 

1 2 3 4 5 

1 2 3 4 5 6 

1 2 3 4 5 6 7 
 * 
 * 
 */


public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========PATTERN 3=========");
		pattern3(5);
		System.out.println("==========PATTERN 4=========");
		pattern4(7);

	}
	
	static void pattern3(int n) {
		for (int row=1;row<=n; row++) {
			for(int col=n;col>=row;col--) {
				System.out.print("# ");
			}
			System.out.println("\n");
		}
	}
	
	static void pattern4(int n) {
		for(int row=1; row<=n; row++) {
			for(int col=1;col<=row; col++) {
				System.out.print(col + " ");
			}
			System.out.println("\n");
		}
	}

}
