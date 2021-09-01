package com.ultramain.um21.basic8;

public class Greet {
	 int time; 
	    
		public void greet(){
		 time = 7;	
		}
		public void greet(int time){
			this.time = time;
		}
		public void greetMessage(){
			greetMorning();
			greetEvening();
		}
		public void greetMorning(){
			System.out.println("Good Morning.......");
		}
		public void greetEvening(){
			System.out.println("Good Evening......");
			greetNight();
		}
		public void greetNight(){
			if(time>20){
			System.out.println("Good Night.....");
			}
		}
	}



