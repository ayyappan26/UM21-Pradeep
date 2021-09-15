package com.ultramain.um21.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueCollection {
	public static void main(String arg[]){
	new UniqueCollection().getCollection();
		
	}


	public Set<String> getCollection(){
		String arr[]={"John","Adam","Michael","Bala","John","Peter"};
		List<String> list3=Arrays.asList(arr);
		Set<String> list4=new TreeSet<>(list3);
		System.out.println(" "+list4);
		return list4;

		
	}
}