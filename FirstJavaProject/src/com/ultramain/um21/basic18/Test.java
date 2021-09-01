package com.ultramain.um21.basic11;

import com.ultramain.um21.basic11.Animal;
import com.ultramain.um21.basic11.Crow;
import com.ultramain.um21.basic11.Dog;

public class Test {
	public static void main(String arg[]){
		Crow mycrow= new Crow();
		mycrow.weep();
		mycrow.bark();
		mycrow.eat();
		
	}
}
	class Animal{
		public void eat(){
			System.out.println("animal eat food");
		}
	}
	class Dog extends Animal{
		public void bark(){
			System.out.println("dog barks");
		}
	}
	class Crow extends Dog{
		public void weep(){
			System.out.println("crow crawls");
		}
	}

