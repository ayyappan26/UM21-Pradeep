package com.ultramain.um21.natural;

public class Natural {

	public static void main(String[] args) {
		Naturals mynatural=new Naturals();
		mynatural.calculateSum(10);
		
	

	}

}
class Naturals{
		public int calculateSum(int n){
			int sum=0;
			for(int i=1;i<=n;i++){
				if(i%3==0||i%5==0){
					//System.out.println(" "+i);
					sum=sum+i;
				
					System.out.println(" "+sum);
				}
			}
			return sum;
			
		}
}
	