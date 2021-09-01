package com.ultramain.um21.basic20;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Vechicle {
	int speed;
	
	public Vechicle(int speed){
	
		this.speed=speed;
	} 
	public Vechicle(){
		
	}
	
	public void getvehicleSpeed(){
		SimpleDateFormat mydf=new SimpleDateFormat("hh:mm:ss");
		Date dt=new Date();
		int hours=dt.getHours();
		
		System.out.println(mydf.format(dt) );
		int min=dt.getMinutes();
		if (hours>=1&&hours<=13){
			speed=speed+20;
			System.out.println("vechicle speed"+speed);
			
		}
		else{
			speed=speed-20;
			System.out.println("vechicle speed"+speed);
		}
		
		
		
	}

}
