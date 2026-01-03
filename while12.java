package com.bridepath.percentage;

import java.util.Scanner;

public class while12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;
		System.out.println("Enter the no:");
		no=sc.nextInt();
		
		int i;
		int count=0;
		while(no>0) {
			int rem=no%10;
			count++;
			no=no/10;
		}
		System.out.println("Total digits in the no is:"+count);
	}

}
