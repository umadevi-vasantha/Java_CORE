package com.ooo.properties.abstarction;

public interface Shape {
	

	double calculateArea();
	double calculatePerimeter();
}


class Circle implements Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 *Math.PI*radius;
	}
	
}

class Rectangle implements Shape{
	private double length;
	private double width;
	
	public Rectangle(double length , double width) {
		this.length=length;
		this.width=width;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length+width;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 *(length+width);
	}
	
}



