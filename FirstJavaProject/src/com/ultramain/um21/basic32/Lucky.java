package com.ultramain.um21.basic32;
import java.util.ArrayList;

public class Lucky {
	public void getLuckyRegisteration(int luckyNumber){
		ArrayList<Integer> result=new ArrayList<Integer>();
		int cur=0;
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i>10 && i==luckyNumber){
				result.add(i);
			}
			else if(i>=10){
				cur=i;
				while(i>0){
				sum=sum+cur%10;
				cur=cur/10;
				}
			
			if(sum>10){
				cur=sum;
				sum=sum+cur%10;
				cur=cur/10;
			}
		}
		if(sum==luckyNumber){
			result.add(i);
		}
		sum=0;
		}
	
		for(int x:result){
			if(x>0){
				result.add(x);
			}
		
		
}
}
}
		
