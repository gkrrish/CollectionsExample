package com.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Add {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		//Add is nothing but adding elements to list
		System.out.println(list.toString());
		
		//saving values through index based
		list.add(3, 50);//If index here 4 means, get a error, add index will looks immediate index number or existing index
		//replacement it will looks. but far away index it wont looks.
		System.out.println(list);

	}

}
