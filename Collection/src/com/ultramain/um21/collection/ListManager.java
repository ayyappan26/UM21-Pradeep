package com.ultramain.um21.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public  class ListManager {
	public static void main(String arg[]){
		new ListManager().removeElements();
		new ListManager().getArrayList();
	}
		
	public List<String> removeElements(){
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Hello");
		list1.add("welcome");
		list1.add("Hi");
		list1.add("Java");
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Hello");
		list2.add("Java");
		list2.add("Raj");
		list1.retainAll(list2);
		System.out.println(" "+list1);
		
		return list1 ;
		
	}
	public Set<String> getArrayList(){
		String arr[]={"John","Adam","Varun"};
		List<String> list3=Arrays.asList(arr);
		Set<String> list4=new TreeSet<>(list3);
		System.out.println(" "+list4);
		return list4;
		
	}
	
}


