package com.bridepath.percentage;

import java.util.Scanner;

public class ifelse1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double no_1;
		System.out.println("Enter the First no:");
		no_1=sc.nextDouble();
		
		double no_2;
		System.out.println("Enter the Secont no:");
		no_2=sc.nextDouble();
		
		if(no_1>no_2) {
			System.out.println("First no is Greater");
			
		}
		else {
			System.out.println("Second no is Greater");
		}
	}

}
