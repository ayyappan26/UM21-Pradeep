package com.ultramain.um21.basic4;

public class Fibonacci {
	public static void main(String arg[]){
	
			int f=0,s=1,t,i,count=5;
			System.out.println(f+" "+s);
			for(i=2;i<count;i++){
				t=f+s;
				System.out.println(""+t);
				f=s;
				s=t;
		}
	}

}
