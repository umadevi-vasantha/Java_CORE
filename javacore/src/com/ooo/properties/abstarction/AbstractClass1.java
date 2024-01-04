package com.ooo.properties.abstarction;

public abstract class AbstractClass1 {

	String name;
	static String department;
	static final String EMPID = "1001";

	public AbstractClass1(String name) {
		this.name = name;
		department = "IT";

	}

	abstract void display();
	abstract void displayAbstract();

	void showInfo() {
		System.out.println("Inside a abstract class- concrete method");
	}

	final void finalMethod() {
		System.out.println("This is final method in abstarct class");
	}
	
	static void staticMethos() {
		System.out.println("This is static method in abstarct class");
	}
	/*
	 * abstarct final not possible abstrcat static also not possible Abstract
	 * methods cannot be declared as final/Static. because the whole purpose of
	 * abstraction is to allow subclasses to provide implementations for abstract
	 * methods.
	 * 
	 */
	//
	// abstract final void abstarctFinalMethod();
	//abstract static void abstarctStaticMethod();

}

abstract class AbstarctSubClass extends AbstractClass1{

	public AbstarctSubClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	abstract void display3();
	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void displayAbstract() {
		// TODO Auto-generated method stub
		
	}
	
}


class AbstractSubClass1 extends AbstarctSubClass{

	public AbstractSubClass1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void display3() {
		// TODO Auto-generated method stub
		
	}




}