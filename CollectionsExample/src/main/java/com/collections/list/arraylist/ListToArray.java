package com.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		Object[] array = list.toArray();
		System.out.println(array[1]);
	}
}
