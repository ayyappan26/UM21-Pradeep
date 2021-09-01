package com.ultramain.um21.basic26;
import com.ultramain.um21.basic27.Family;

public class Neighborg {
	public static void main(String arg[]){
		GrandSon mygrandson=new GrandSon();
		mygrandson.run();
		mygrandson.play();
	}

}
class GrandSon extends Dad{
	public void run(){
		System.out.println("Grand son runs");
	}
}
