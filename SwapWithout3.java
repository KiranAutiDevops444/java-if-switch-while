package com.bridepath.percentage;

import java.util.Scanner;

public class SwapWithout3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a;
		System.out.println("Enter First no:");
		a=sc.nextDouble();
		
		double b;
		System.out.println("Enter Second no:");
		b=sc.nextDouble();
		
		System.out.println("Before Swapping the no:"+a+"and"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping "+a+"and"+b);
	}

	
}
