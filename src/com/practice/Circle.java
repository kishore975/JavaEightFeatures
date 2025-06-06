package com.practice;

public class Circle implements Shape {

	int radius;
	
	
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}



	@Override
	public float calculateArea() {
		return (float) (Math.PI * radius * radius);
	}

}
