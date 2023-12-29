package com.ooo;

class LocalOuterClass{
	int a =70;
	
	public void methodLocalClass() {
		int localVarible =10;
		class LocalClass{
			public void localMethod() {
				System.out.println("Accessing the varible inside the local Method"+localVarible);
				System.out.println("Accessing the OuterClass varible"+a);
				
			}
			
		}
		//The Scope of the local inner class is limited to the methos in which its defined. Therefore, You can only create instance of the local inner class and call its methos within that method
		LocalClass localClass= new LocalClass();
		localClass.localMethod();
	}
	
}
public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalOuterClass outerclass= new LocalOuterClass();
		outerclass.methodLocalClass();
		
	}

}
