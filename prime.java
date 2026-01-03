package com.bridepath.percentage;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		int limit=100;
		
		System.out.println("The Prime no between 1 and "+limit+" is:");
		
		for(int no=1;no<=limit;no++) {
			boolean isprime=true;
			
			for(int i=2;i<=no/2;i++) {
				if(no%i==0) {
				isprime=false;
				break;
		}
		
				
			}
			if(isprime) {
				System.out.println(no+" ");
			}
			
		}
		
		
	}
}
