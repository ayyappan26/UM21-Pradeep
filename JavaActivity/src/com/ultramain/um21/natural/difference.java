package com.ultramain.um21.natural;

public class difference {

	public static void main(String[] args) {
		DifferenceO mydiff=new DifferenceO();
		mydiff.calculateDifference(3);
	

	}

}
class DifferenceO{
	public int calculateDifference(int n){
		int i,j,k;
		i=(n*(n+1)*(2*n+1))/6;
		j=(n*(n+1))/2;
		j=j*j;
		k=Math.abs(i-j);
		System.out.println(" "+k);
		
		return k;
		
	}
}
