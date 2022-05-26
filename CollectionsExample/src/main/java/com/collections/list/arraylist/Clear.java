package com.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Clear {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		list.clear();
		System.out.println(list);//[] empty prints because we cleared list
		list.add(88);
		System.out.println(list);//prints 88
	}
}
