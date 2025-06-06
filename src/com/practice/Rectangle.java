package com.practice;

public class Rectangle implements Shape {

	int length;
	int breadth;
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public float calculateArea() {
		return length*breadth;
		
		
	}

}
