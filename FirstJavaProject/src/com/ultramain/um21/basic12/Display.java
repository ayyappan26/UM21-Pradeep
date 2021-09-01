package com.ultramain.um21.basic12;
import com.ultramain.um21.basic11.Laptop;

public class Display {
	public void displayLaptopDetails(Laptop laptop){
		System.out.println("Model          :" + laptop.getModel());
		System.out.println("processortype         :" + laptop.getProcessorType());
		System.out.println("ramSize        :" + laptop.getramSize());
		System.out.println("purchaseYear        :" + laptop.getpurchaseYear());
		
	}

}
