package com.bridepath.percentage;

import java.util.Scanner;

public class while4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no1;
		System.out.println("Enter the Starting:");
		no1=sc.nextInt();
		
		int no2;
		System.out.println("Enter Ending:");
		no2=sc.nextInt();
		
		int i,sum=0;
		i=no1;
		while(i<=no2) {
			sum=sum+i;
			i++;
		}
		
		System.out.println("The sum is:"+sum);
	}

}
