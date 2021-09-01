package com.ultramain.um21.basics3;

public class TestProgram {
	public static void main(String arg[]){
		addNum(10,50);
		subNum(50,40);
		mulNum(50,4);
		divNum(50,10);
	}
	public static void addNum(int a, int b){
		int c=a+b;
		System.out.println(""+c);
	}
	public static void subNum(int a, int b){
		int c=a-b;
		System.out.println(""+c);
	}
	public static void mulNum(int a, int b){
		int c=a*b;
		System.out.println(""+c);
	}
	public static void divNum(int a, int b){
		int c=a/b;
		System.out.println(""+c);
	}
	



}
