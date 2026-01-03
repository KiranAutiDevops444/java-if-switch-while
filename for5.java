package com.bridepath.percentage;

import java.util.Scanner;

public class for5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no1;
		System.out.println("Enter Starting no:");
		no1=sc.nextInt();
		
		int no2;
		System.out.println("Enter ending no:");
		no2=sc.nextInt();
		
		int i,sum1 = 0,sum2=0;
		for(i=no1;i<=no2;i++) {
			if(i%2==0) {
				sum1=sum1+i;
				
			}
			
			else {
				sum2=sum2+i;
				
			}
		}
		System.out.println("even no sum is:"+sum1);
		System.out.println("Odd no sum is:"+sum2);
		
	}

}
