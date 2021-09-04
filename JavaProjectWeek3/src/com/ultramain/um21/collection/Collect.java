package com.ultramain.um21.collection;

import java.util.ArrayList;

public class Collect {

	public static void main(String[] args) {
		Collects coll=new Collects();
		ArrayList<Integer> result=new ArrayList<Integer>();
		result=coll.storeEvenNumbers(10);
		System.out.println(result);
		coll.printEvenNumbers(result);
		int r=coll.retriveEvenNumber(10);
		System.out.println(r);
		

	}

}
class Collects{
	ArrayList<Integer> list=new ArrayList<Integer>();
	public ArrayList<Integer> storeEvenNumbers(int n){
		list=new ArrayList<Integer>();
		for(int i=2;i<n;i++){
			if(i%2==0){
				list.add(i);
			}
		}
		return list;
		
	}
	public void printEvenNumbers(ArrayList<Integer> list){
		ArrayList<Integer> list2=new ArrayList<Integer>();
		for(int x: list){
			list2.add(x*2);	
		}
		
		System.out.println(list2);
	}
	public int retriveEvenNumber(int s){
		boolean bl=list.contains(s);
		if(bl){
			return s;
		}else{
		return 0;
		}
	}
}


