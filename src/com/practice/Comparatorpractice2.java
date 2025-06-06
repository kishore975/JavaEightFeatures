package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparatorpractice2 {
	
	public static void main(String[] args) {
		
		Comparator<String> sCom= new Comparator<String>() {
			
			@Override
			public int compare(String first, String second) {
				if(first.length() > second.length())
				return 1;
				else
				return -1;
			}
		};
		
		
		List<String> names= new ArrayList<String>();
		
		names.add("arjun");
		names.add("bharat");
		names.add("sriram");
		names.add("praveen");
		names.add("kishore");
		
		
		System.out.println("Original flow :- "+names);
		
		Collections.sort(names);
		
		System.out.println("Sorting names alphabetically :- "+ names);
		
		Collections.sort(names,sCom);
		
		System.out.println("Comparator sort :- "+names);
		
		
	}

}
