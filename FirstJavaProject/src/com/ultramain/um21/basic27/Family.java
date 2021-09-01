package com.ultramain.um21.basic27;

public class Family {
	public static void main (String arg[]){
		Son myson=new Son();
		myson.sleep();
		myson.eat();
		
	}

}
class Dad{
		protected void eat(){
		System.out.println(" DAd eats chciken");
		
	}
}
class Son extends Dad{
	public void sleep(){
		System.out.println("Son sleep");
		
	}
	public void eat(){
		System.out.println("son eats pizza");
	}
}
