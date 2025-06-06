package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorPractice1 {
	
	
	
	public static void main(String[] args) {
		
		Comparator<Integer> iCom = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer first, Integer second) {
				
				if(first%10 > second%10)
				return 1;
				else
			    return -1;
			}
		};
		
		
		List<Integer> marks= new ArrayList<Integer>();
		
		marks.add(12);
		marks.add(21);
		marks.add(34);
		marks.add(76);
		marks.add(28);
		
		System.out.println("Original flow :- "+marks);
		
		
		Collections.sort(marks);
		
		System.out.println("Default sorting :- "+ marks);
		
		Collections.sort(marks,iCom);
		
		System.out.println("Comparator Sort :- "+ marks);
		
	
		
	}

}
