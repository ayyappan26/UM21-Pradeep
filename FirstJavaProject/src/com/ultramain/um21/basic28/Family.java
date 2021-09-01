package com.ultramain.um21.basic28;


public class Family {
	public static void main(String arg[]){
	Son myson=new Son();
	myson.grand();
	myson.play();
	myson.swim();
	}
	
	

}
  abstract class GrandDad{
	public void eat(){
		System.out.println("granddad eats rice");
	}
	public abstract void play();
	 public  void swim(){
		System.out.println("granddad likes to swim");
	}
	
}

class Son{
	
	public void play(){
		System.out.println("son plays cricket ");
	}
	public void swim(){
		System.out.println("son likes to swim ");
	}
}

