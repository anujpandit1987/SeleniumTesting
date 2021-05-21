package com.interview.practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListExample {

	public static void main(String[] args) {
		
	//	LinkedList<String> list = new LinkedList<String>();
		Set<String> hashset = new HashSet<>();
		
		/*
		 * list.add("A"); list.add("B"); list.add("C"); System.out.println(list);
		 * 
		 * list.addFirst("D");
		 * 
		 * System.out.println(list); list.add(2, "E"); System.out.println(list);
		 * 
		 * list.remove("B"); System.out.println(list);
		 */
		
		hashset.add("H");
		hashset.add("A");
		boolean b1 = hashset.add("S");
		System.out.println(b1);
		boolean b2 = hashset.add("S");
		System.out.println(b2);
		
		System.out.println(hashset);
		hashset.contains("H");
		 

	}

}
