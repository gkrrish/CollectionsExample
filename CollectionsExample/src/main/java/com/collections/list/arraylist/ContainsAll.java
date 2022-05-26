package com.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ContainsAll {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		List<Integer> list2=new ArrayList<>();
		list2.add(20);
		
		boolean containsAll = list.containsAll(list2);
//		System.out.println(containsAll);//true
		
		List<Integer> list3=new ArrayList<>();
		list3.add(40);
		list3.add(50);
		
		boolean containsAll2 = list.containsAll(list3);
//		System.out.println(containsAll2);//false
		
		List<Integer> list4=new ArrayList<>();
		list3.add(20);
		list3.add(50);
		
		boolean containsAll3 = list.containsAll(list4);
//		System.out.println(containsAll3);//atleast one match also true
		
		List<Integer> list5=new ArrayList<>();
		list3.add(10);
		list3.add(20);
		
		boolean containsAll4 = list.containsAll(list5);
		System.out.println(containsAll4);//both match also true
		
		
	}
}
