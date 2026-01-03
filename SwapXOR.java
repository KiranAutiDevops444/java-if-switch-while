package com.bridepath.percentage;

import java.util.Scanner;

public class SwapXOR {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a;
		System.out.println("Enter First no:");
		a=sc.nextInt();
		
		int b;
		System.out.println("Enter Second no:");
		b=sc.nextInt();
		
		System.out.println("Before Swapping"+a+"and"+b);
		
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After Swapping"+a+"and"+b);
	}

}
