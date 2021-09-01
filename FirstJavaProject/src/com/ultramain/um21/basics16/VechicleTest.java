package com.ultramain.um21.basics16;

public class VechicleTest {
	public static void main(String arg[]){
		MaruthiCar mycar=new MaruthiCar();
		mycar.music();
		mycar.steering();
	}	
		
	}
	class Vechicle{
		public void steering(){
			System.out.println("Manual steering");
		}
		
	}
	class Car extends Vechicle{
		public void music(){
			System.out.println("car has music system");
		}
	}
	class MaruthiCar extends Car{
		
	}





