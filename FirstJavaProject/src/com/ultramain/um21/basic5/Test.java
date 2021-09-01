package com.ultramain.um21.basic5;
import com.ultramain.um21.basic6.Car;

public class Test {
	public static void main(String arg[]){
		Car user=new Car();
		user.carType("Tata");
		user.carModel(2015);
		user.carPrice(4500);
		user.printCarDetails();
		
	}

}
