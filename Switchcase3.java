package com.bridepath.percentage;

import java.util.Scanner;

public class Switchcase3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char calc;
		System.out.println("Enter the Operator:");
		calc=sc.next().charAt(0);
		
		double firstno;
		System.out.println("Enter First no:");
		firstno=sc.nextDouble();
		
		double secondno;
		System.out.println("Enter Second no:");
		secondno=sc.nextDouble();
		
		switch (calc) {
		case '+':
			System.out.println("Addition is:"+(firstno+secondno));
			break;
		case '-':
			System.out.println("Subtraction is:"+(firstno-secondno));
			break;
		case '*':
			System.out.println("Multiplication is:"+(firstno*secondno));
			break;
		case '/':
			System.out.println("Division is:"+(firstno/secondno));
			break;
		case '%':
			System.out.println("Modulation is:"+(firstno%secondno));
			break;
		default:
			System.out.println("Invalid Operator");
		}
		
		
	}

}
