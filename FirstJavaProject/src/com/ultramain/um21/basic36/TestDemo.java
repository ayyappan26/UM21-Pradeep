package com.ultramain.um21.basic36;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestDemo {
	public static void main(String arg[]){
		new Demo().setlist();
	}
	

}
class Demo{
	public void addList(){
		List<Integer> mylist=new ArrayList<Integer>();
		mylist.add(10);
		mylist.add(30);
		System.out.println(mylist.get(0));
	}
	public void setlist(){
		Set<Integer> myset=new TreeSet<Integer>();
		myset.add(40);
		myset.add(20);
		myset.add(60);
		myset.add(40);
		for (int res: myset){
			System.out.println(myset);
		}
		
	}
}
