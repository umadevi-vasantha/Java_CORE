package com.ooo;

public class ObjectMethodClone implements Cloneable {
	
	String firstName;
	String lastName;
	
	public ObjectMethodClone(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		//When you use the default super.clone() method, it creates a new object, but the internal fields are not cloned deeply. 
		//Hence equals return false, Shallow copy
		//return super.clone();
		//Deep copy()
		ObjectMethodClone obj = new ObjectMethodClone(this.firstName, this.lastName);
		return obj;
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ObjectMethodClone obj=new ObjectMethodClone("Umadevi","Sunil");
		ObjectMethodClone obj1= (ObjectMethodClone) obj.clone();
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj.equals(obj1));
		Object object=new Object();
		
		
		

	}

}
