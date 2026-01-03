package com.bridepath.percentage;

import java.util.Scanner;

public class while6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;
		System.out.println("Enter no:");
		no=sc.nextInt();
		
		int i=1;
		long fact=1;
		while(i<=no) {
			fact*=i;
			i++;
			
		}
		System.out.println("Factorial of the given no is:"+fact);
		
		
	}

}
