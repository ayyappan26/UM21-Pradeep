package com.ultramain.um21.basic17;


public class VechicleTest {
	public static void main(String arg[]){
		MaruthiCar mycar=new MaruthiCar();
		mycar.music();
		mycar.vechicleSpeed();
		
	}	
		
	}
	class Vechicle{
		int speed;
		public void vechicleSpeed(){
			System.out.println("vehicle speed"+speed);
		}
		
	}
	class Car extends Vechicle{
		public void music(){
			System.out.println("car has music system");
		}
	}
	class MaruthiCar extends Car{
		public  MaruthiCar(){
			speed=20;
		}
		
	}






