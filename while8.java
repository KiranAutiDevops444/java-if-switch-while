package com.bridepath.percentage;

import java.util.Scanner;

public class while8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;
		System.out.println("Enter a number:");
		no=sc.nextInt();
		
		int i = 0,sum=0;
		while(no>0) {
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
			
			
			
			
		}
		System.out.println("Sum of the Digits is:"+sum);
	}

}
