package com.ooo.properties.polymorphism;

class Shapes{
	double area() {
		System.out.println("IN SUPER CLASS METHOD");
		return 0.0;
		
	}
}

class Circle extends Shapes{
	
	double radius;
	 public Circle(double radius){
		 this.radius =radius;
	 }
	
	double area() {
		System.out.println("In Sub class Circle");
		return Math.PI * radius *radius;
	}
}

class Square extends Shapes{
	
	double length;
	double breadth;
	 public Square(double length, double breadth){
		 this.length =length;
		 this.breadth=breadth;
	 }
	
	double area() {
		System.out.println("In Sub class Square");
		return length*breadth;
	}
}

public class RuntimePolymorphism {
	
	public static void printArea(Shapes shape) {
		System.out.println("Area is "+shape.area());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes circle =new Circle(5);
		printArea(circle);
		Shapes Square =new Square(4.8, 8.0);
		printArea(Square);
		
		

	}

}
