package com.bridepath.percentage;

import java.util.Scanner;

public class while2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no1;
		System.out.println("Enter the Starting:");
		no1=sc.nextInt();
		
		int no2;
		System.out.println("Enter Ending:");
		no2=sc.nextInt();
		
		int i=no2;
		
		
		while(i>=no1) {
			System.out.println(i);
			i--;
		}
	}
}
