package com.bridepath.percentage;

import java.util.Scanner;

public class while9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;
		System.out.println("Enter number:");
		no=sc.nextInt();
		
		int i,sum1=0,sum2=0;
		while(no>0) {
			int rem=no%10;
			
			
			if(rem%2==0) {
				sum1=sum1+rem;
				
			}
			else {
				sum2=sum2+rem;
				
				
			}
			no=no/10;
			
		}
		System.out.println("Sum of Even no is:"+sum1);
		System.out.println("Sum of Odd no is:"+sum2);
		
	}

}
