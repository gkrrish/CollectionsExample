package com.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AddAll {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		List<Integer> list2 = new ArrayList<>();
//		boolean addAll = list2.addAll(list);
//		System.out.println(addAll);//true
//		System.out.println(list2);
		boolean addAll2 = list2.addAll(0, list);//index will looks immediate entry if not there gives exception
//		System.out.println(addAll2);//true
		System.out.println(list2);

	}

}
