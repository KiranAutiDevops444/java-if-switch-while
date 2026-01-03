package com.bridepath.percentage;

import java.util.Scanner;

public class ifselse5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		
		double no;
		System.out.println("Enter any no:");
		no=sc.nextDouble();
		
		if(no%2==0) {
			System.out.println("Given no is Even");
			
		}
		else {
			System.out.println("Given no is Odd");
		}
		
	}

}
