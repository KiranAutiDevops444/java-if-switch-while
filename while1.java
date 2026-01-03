package com.bridepath.percentage;

import java.util.Scanner;

public class while1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no1;
		System.out.println("Enter the starting :");
		no1=sc.nextInt();
		
		int no2;
		System.out.println("Enter the Ending :");
		no2=sc.nextInt();
		
		int i=no1;
		while(i<=no2) {
			System.out.println(i);
			i++;
		}
	}
}
