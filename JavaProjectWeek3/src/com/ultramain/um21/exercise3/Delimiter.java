package com.ultramain.um21.exercise3;

public class Delimiter {

	public static void main(String[] args) {
		String str="C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
		String[] tokens=str.split("|");
		for(String t:tokens){
			System.out.println(t);
		}
		

	}

}
