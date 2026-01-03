package com.bridepath.percentage;

import java.util.Scanner;

public class ifelse4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double no;
		System.out.println("Enter any number:");
		no=sc.nextDouble();
		if(no>0) {
			System.out.println("Given no is Positive");
			
		}
		else {
			System.out.println("Given no is Negative");
		}
	}

}
