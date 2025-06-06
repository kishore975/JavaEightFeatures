package com.practice;

public class Lambdapractice {
	
	public static void main(String[] args) {
		Shape obj1= new Rectangle(10, 20);
		System.out.println(" Area of Rectangle : "+obj1.calculateArea());
		
		Shape obj2= new Circle(10);
		System.out.println(" Area of Cirle : "+obj2.calculateArea());
		
		Shape rectangle = () -> {
			int length = 10;
			int breadth = 30;
			return length*breadth;
				
		};System.out.println(rectangle.calculateArea());
		
		
		
	}

}
