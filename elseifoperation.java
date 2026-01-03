package com.bridepath.percentage;

import java.util.Scanner;

public class elseifoperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double firstno;
		System.out.println("Enter first no:");
		firstno=sc.nextDouble();
		
		double secondno;
		System.out.println("Enter Second no:");
		secondno=sc.nextDouble();
		
		char oper;
		System.out.println("Enter operator:");
		oper=sc.next().charAt(0);
		
		if(oper=='+') {
			System.out.println("Addition is:"+(firstno+secondno));
		}
		else if(oper=='-') {
			System.out.println("Subtraction is:"+(firstno-secondno));

		}
		else if(oper=='*') {
			System.out.println("Multiplication is:"+(firstno*secondno));
	}
		else if(oper=='/') {
			System.out.println("Division is:"+(firstno/secondno));
		}
		else if(oper=='%') {
			System.out.println("Mode is:"+(firstno%secondno));
		}
		else {
			System.out.println("Invalid operator");
		}
}
}
