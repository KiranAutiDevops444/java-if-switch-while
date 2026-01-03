package com.bridepath.percentage;

import java.util.Scanner;

public class for4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no1;
		System.out.println("Enter Starting no:");
		no1=sc.nextInt();
		
		int no2;
		System.out.println("Enter Ending point:");
		no2=sc.nextInt();
		
		int i,sum=0;
		for(i=no1;i<=no2;i++) {
			
			sum=sum+i;
			
			
		}
		System.out.println("The Sum of the Given no is:"+sum);
	}

}
