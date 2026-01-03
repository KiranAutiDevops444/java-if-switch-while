package com.bridepath.percentage;

import java.util.Scanner;

public class while5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no1;
		System.out.println("Enter Starting:");
		no1=sc.nextInt();
		
		int no2;
		System.out.println("Enter Ending:");
		no2=sc.nextInt();
		
		int i,sum1=0,sum2=0;
		i=no1;
		while(i<=no2) {
			if(i%2==0) {
				sum1=sum1+i;
				i++;
			}
			else {
				sum2=sum2+i;
				i++;
			}
		}
		System.out.println("Even sum is:"+sum1);
		System.out.println("Odd sum is:"+sum2);
	}
	
	

}
