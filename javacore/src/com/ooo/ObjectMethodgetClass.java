package com.ooo;



/*
 * 4. getClass():
	A. public Class<?> getClass()
	B. Description: Returns the runtime class of an object as a Class object.
	C. Useful Scenarios:
		Obtaining information about the runtime type of an object.
		Useful for reflection and runtime type checking.
 */
public class ObjectMethodgetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Umadevi";
		Class<?> class1=str.getClass();
		System.out.println("Class of str" + class1);
		ObjectMethodHashCode obj= new ObjectMethodHashCode("Git Commands","Sunil");
		Class<?> class2 = obj.getClass();
		System.out.println("Class of obj"+ class2);
	}

}
