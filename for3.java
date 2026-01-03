package com.bridepath.percentage;

import java.util.Scanner;

public class for3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;
		int i;
		System.out.println("Enter the the no for printing table:");
		no=sc.nextInt();
		
		for(i=1;i<=10;i++) {
			System.out.println(no +"*" +i +"=" +(no*i));
		}
		
	}
}
