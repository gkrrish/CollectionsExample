package com.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Contains {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		boolean contains = list.contains(20);
		System.out.println(contains);//true
	}
}
