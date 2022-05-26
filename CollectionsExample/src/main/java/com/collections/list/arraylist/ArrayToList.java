package com.collections.list.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {
		Integer[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		List<Integer> asList = Arrays.asList(x);
		System.out.println(asList);
	}

}
