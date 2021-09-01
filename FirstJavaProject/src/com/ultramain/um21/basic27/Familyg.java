package com.ultramain.um21.basic27;

public class Familyg {
	public static void main(String arg[]){
		Daughter mydaughter=new Daughter();
		mydaughter.play();
		mydaughter.eat();
		
	}

}
class Daughter extends Dad{
	public void play(){
		System.out.println("daughter plays");
	}
}
