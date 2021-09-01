package com.ultramain.um21.basic24;


public class Animal {public static void main(String arg[]){
	MalePup mypup= new MalePup();
	FemalePup myfpup=new FemalePup();
	
	
}
}
class Dog{
	public void bark(){
		System.out.println("dog barks");
		}
	public void eat(){
		System.out.println("Dog eats rice");
	}
}
class MalePup extends Dog{
	public void weep(){
		System.out.println("pup weeps");
	}
	public void eat(){
		System.out.println("male pup likes to pedigree");
	}
	
	class FemalePup extends Dog{
		public void weep(){
			System.out.println("pup weeps");
			
		}
		public void eat(){
			System.out.println("female pup likes to eat icecream");
	}
}
	public void displayDetails(Dog mydog){

		if(mydog instanceof MalePup){
			MalePup mympup=(MalePup)Dog;
			mypup.weep();
			mypup.sleep();
		}

			if(mydog instanceof FemalePup){
				FemalePup myf
				.0alePup mympup=(MalePup)Dog;
				mypup.weep();
				mypup.sleep();
			}

		
	}
}





