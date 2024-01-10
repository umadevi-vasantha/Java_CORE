package com.ooo.properties.abstarction;

public class GraphicsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle(4.76);
		System.out.println(circle.calculateArea());
		System.out.println(circle.calculatePerimeter());
		Shape rectangle=new Rectangle(78.9, 99);
		System.out.println(rectangle.calculateArea());
		System.out.println(rectangle.calculatePerimeter());
	}

}
