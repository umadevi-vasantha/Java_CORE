package com.ooo;

public class SingletonClass {
	
	
	public String name;
	//Deifning a private constructor. The constructor is private to prevent external classes from creating instances of the singlton
	//class directlty. It also allows the class itself to control the instantiation process
	private SingletonClass(){
		
	}
	//Decalres a private static varible named 'instance' of type singleton.
	//This varible will hold the single instance of the class.
	//It is static to ensure there is only one instance shared among all instances of the class
	private static SingletonClass instance;
	
	//Defines a public static method named 'getInstance() . This method provides a global point of access to the singleton instance
	//If instance doesnot exist(lazy initialization) , it created one and return it
	public static SingletonClass getInsatnce() {
		if (instance==null) {
			instance = new SingletonClass();
		}
		return instance;
		
	}
	
	static {
		System.out.println("You are inside SingletonClass");
	}
}
