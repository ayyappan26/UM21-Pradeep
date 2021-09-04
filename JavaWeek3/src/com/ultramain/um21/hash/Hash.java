package com.ultramain.um21.hash;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		String country = "India";
		HashS myhash=new HashS();
		HashSet<String> h3=new HashSet<String>();
		h3=myhash.storeCountryNames(country);
		System.out.println(h3);
		
	}

}
class HashS{
	HashSet<String> h1=new HashSet<>();
	public HashSet<String> storeCountryNames(String country ){
		h1=new HashSet<String>();
		h1.add(country);
		return h1;
		}
	public String retrieveCountry(String country){
		Boolean b1=h1.contains(country);
		if(b1){
		return country;
		}
		else{
			return null;
		}
		
	}

}
