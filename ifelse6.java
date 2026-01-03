package com.bridepath.percentage;

import java.util.Scanner;

public class ifelse6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double no;
		System.out.println("Enter any no:");
		no=sc.nextDouble();
		
		if(no%7==0) {
			System.out.println("Given no is Multiple of 7");
			
		}
		else {
			System.out.println("Given no is not multiple of 7");
		}
	}

}
