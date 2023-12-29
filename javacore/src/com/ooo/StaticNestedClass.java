package com.ooo;

//Static Nested Class Example 

class OuterClass{
	int b=20;
	private static int a=10;
	public static class Inner{
		public static void staticNestedMethod() {
			System.out.println("This is a static Nested Method");
			//System.out.println("Accessing the non static varible form Static Inner Class is not Possible"+b);
			System.out.println("Accessing the static varible from Staic Inner class"+a);
			outerMethod();
			//Form Static Inner Class we can only access  static members(Varibles/Methods)
			//nonstaticOuterMethod();
		}
		
		
	}
	
	public static void outerMethod() {
		System.out.println("This is outer method");
		
		
	}
	public void nonstaticOuterMethod() {
		System.out.println("This is Non static Outer Class method");
	}
}



public class StaticNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Compared to Member Inner Class , in  static nested inner class we no need to create a instance of Outer class
				OuterClass.Inner obj = new OuterClass.Inner();
				obj.staticNestedMethod();
				//Since the inside inner class is also static we can call like this
				OuterClass.Inner.staticNestedMethod();

	}

}
