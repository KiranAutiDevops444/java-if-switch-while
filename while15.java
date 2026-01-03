package com.bridepath.percentage;

import java.util.Scanner;

public class while15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;
		int sum=0;
		System.out.println("Enter a no:");
		no=sc.nextInt();
		int temp=no;
		
		while(no>0) {
			int rem=no%10;
			int cube=rem*rem*rem;
			sum=sum+cube;
			no=no/10;
			
		}
		if(temp==sum) {
			System.out.println("Armstrong");
			
		}
		else {
			System.out.println("Not-Armstrong");
		}
	}
}
