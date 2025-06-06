package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
	 int age;
	 String name;
	
	public Student(int age, String name) {
		this.age= age;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	
	public int compareTo(Student that) {
		if(this.age > that.age)
		return 1;
		else
			return -1;
	}
	
	
	
	
}
	
	
public class Comparatorpractice3 
{
	
	public static void main(String[] args) 
	{
		
//		Comparator<Student> oCom= new Comparator<Student>() {
//			
//			@Override
//			public int compare(Student first, Student second) {
//				if(first.name.length() > second.name.length())
//				return 1;
//				else
//				return -1;
//			}
//		};
		
		
		List<Student> students= new ArrayList<>();
		
		students.add(new Student(13, "praveen"));
		students.add(new Student(16, "rahul"));
		students.add(new Student(9, "rajeshwari"));
		
		for(Student studs : students)
		System.out.println(studs);
		
		Collections.sort(students);
		System.out.println(students);
		
	}

}
