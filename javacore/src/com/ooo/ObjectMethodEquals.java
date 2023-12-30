package com.ooo;

public class ObjectMethodEquals {
	
	int a;
	int b;
	
	public ObjectMethodEquals(int a, int b) {
		this.a = a;
		this.b = b ;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// Check if the object being compared is the same object
	    if (this == obj) return true;

	    // Check if the object is null or belongs to a different class
	    if (obj == null || getClass() != obj.getClass()) return false;

	    // Cast the object to the same class and compare individual fields
	    ObjectMethodEquals point = (ObjectMethodEquals) obj;
	    return this.a == point.a && this.b == point.b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMethodEquals obj1= new ObjectMethodEquals(21,22);
		ObjectMethodEquals obj2= new ObjectMethodEquals(21,22);
		ObjectMethodEquals obj3= new ObjectMethodEquals(22,22);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj3.equals(obj2));

	}

}
