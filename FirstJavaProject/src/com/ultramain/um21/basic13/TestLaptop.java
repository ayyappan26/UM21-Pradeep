package com.ultramain.um21.basic13;
import  com.ultramain.um21.basic12.Display;
import com.ultramain.um21.basic11.Laptop;


public class TestLaptop {
	 public static void main(String[] args){
		 Laptop mylaptop = new Laptop();
		 mylaptop.setModel("Thinkpad");
		 mylaptop.setProcessorType("i5");
		 mylaptop.setRamSize("8GB");
		 mylaptop.setPurchaseYear("2018");
		 
		 Display lapdisplay = new Display();
		 lapdisplay.displayLaptopDetails(mylaptop);
		 System.out.println("-------------------");
		 
		 Laptop mylaptop2 = new Laptop();
		 mylaptop2.setModel("Think");
		 mylaptop2.setProcessorType("i7");
		 mylaptop2.setRamSize("16GB");
		 mylaptop2.setPurchaseYear("2019");
		 
		 lapdisplay.displayLaptopDetails(mylaptop2);
		 System.out.println("------------------");		 
	 }
		 
 }



