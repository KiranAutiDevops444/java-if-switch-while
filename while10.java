package com.bridepath.percentage;

import java.util.Scanner;

public class while10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;
		System.out.println("Enter number:");
		no=sc.nextInt();
		
		int i,sum=0;
		while(no>0) {
			int rem=no%10;
			
			int cube=rem*rem*rem;
			sum=sum+cube;
			no=no/10;
			
		}
		System.out.println("Cube of the Given no is:"+sum);
	}

}
