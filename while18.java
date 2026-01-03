package com.bridepath.percentage;

import java.util.Scanner;

public class while18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;
		System.out.println("Enter no:");
		no=sc.nextInt();
		int reversed=0;
		
		while(no>0) {
			
			int rem=no%10;
			reversed=reversed*10+rem;
			no=no/10;
			
			
			
			
		}
		System.out.println("Reversed no="+reversed);
		
	}

}
