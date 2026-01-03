package com.bridepath.percentage;

public class primeno {
	public static void main(String[] args) {
		int limit=100;
		
		System.out.println("Prime no between 1 and "+limit+"are:");
		
		for (int number=2;number<=limit;number++) {
			boolean isPrime=true;
		
		
		for (int i=2;i<=number/2;i++) {
			if (number%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(number+" ");
			
		}
		}
	}
}


