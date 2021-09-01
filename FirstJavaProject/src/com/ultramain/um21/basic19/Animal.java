package com.ultramain.um21.basic19;

public class Animal {
	public static void main(String arg[]){
		Pup mypup= new Pup();
		mypup.bark();
		mypup.weep();
		mypup.eat("bone");
		mypup.eat("bone", 4);
		
	}
}
	class Dog{
		public void bark(){
			System.out.println("dog barks");
		}
	}
	class Pup extends Dog{
		public void weep(){
			System.out.println("pup weeps");
		}
		public void eat(String foodType){
			System.out.println("pup likes to eat"+foodType);
		}
		public void eat(String foodType, int count){
			System.out.println("pup likes to eat "+foodType);
			System.out.println("pup eats "+count +" bones");
			
		}
	}


