package com.bridepath.percentage;

import java.util.Scanner;

public class BaseExponant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int base;
		System.out.println("Enter Base:");
		base=sc.nextInt();
		
		int expo;
		System.out.println("Enter Exponent:");
		expo=sc.nextInt();
		int total = 1;
		
		int temp=base;
		for(int i=1;i<=expo;i++) {
		 total=total*base;
		
		
		}
		System.out.println("ans="+total);
	}

}
