package com.bridepath.percentage;

import java.util.Scanner;

public class rhile16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;
		System.out.println("Enter a no:");
		no=sc.nextInt();
		
		int sum=0;
		int temp=no;
		
		while(no>0) {
			int squ=no*no;
			int rem=no%10;
			
			sum=sum+rem;
			no=no/10;
			
		}
		if(temp==sum) {
			System.out.println("Neon no");
		}
		else {
			System.out.println("non-Neon no");
		}
		
	}
}
