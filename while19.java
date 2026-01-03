package com.bridepath.percentage;

import java.util.Scanner;

public class while19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;
		System.out.println("Enter no:");
		no=sc.nextInt();
		int reverse=0;
		int temp=no;
		
		while(no>0) {
			int rem=no%10;
			reverse=reverse*10+rem;
			no=no/10;
			
		}
		if(temp==reverse) {
			System.out.println("Palindrome no");
		}
		else {
			System.out.println("Not a palindrome no");
		}
	}

}
