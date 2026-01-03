package com.bridepath.percentage;

import java.util.Scanner;

public class while7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
			
		int no;
		System.out.println("Enter number:");
		no=sc.nextInt();
		
		while(no>0) {
			int rem=no%10;
			System.out.println(rem);
			no=no/10;
		}
	
		
	}

}
