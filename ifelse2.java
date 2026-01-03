package com.bridepath.percentage;

import java.util.Scanner;

public class ifelse2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double no;
		System.out.println("Enter the First no:");
		no=sc.nextDouble();
		
		
		
		if(no%2==0) {
			System.out.println("Given no is Even no");
			
		}
		else {
			System.out.println("Given no is odd");
		}
	}

}
