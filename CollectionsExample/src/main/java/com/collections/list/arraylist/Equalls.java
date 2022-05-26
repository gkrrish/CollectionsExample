package com.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Equalls {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		boolean equals = list.equals(10);
		System.out.println(equals);//false 
		
		//here, what equals looking for?
		//hashcode or value?
		//== looks for hashcode, and equalls looks for content
		boolean equals2 = list.get(0).equals(10);
		System.out.println(equals2);
		
		int hashCode = list.get(0).hashCode();
		System.out.println(hashCode);//list hashcode is overriden
		
		
	}
}
