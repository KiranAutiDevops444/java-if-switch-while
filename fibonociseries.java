package com.bridepath.percentage;

import java.util.Scanner;

public class fibonociseries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no1;
		System.out.println("Enter first no:");
		no1=sc.nextInt();
		
		int no2;
		System.out.println("Enter Second no:");
		no2=sc.nextInt();
		
		int end;
		System.out.println("Enter the length value of fibonacci series:");
		end=sc.nextInt();
		
		System.out.println("Fibonacci series:");
		
		int sum=0;
		for(int i=no1;i<=end;i++) {
			sum=no1+no2;
			System.out.println(sum);
			no1=no2;
			no2=sum;
			
		}
	}

}
