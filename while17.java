package com.bridepath.percentage;

import java.util.Scanner;

public class while17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;
		System.out.println("Enter no:");
		no=sc.nextInt();
		int temp=no;
		
		
		int sum=0;
		
		
		
		while(no>0) {
			int rem=no%10;
			long fact=1;
			int i=1;
			while(i<=rem) {
				fact*=i;
				i++;
			}
			//logic of factorial
			//fact*=rem;
			
			
			sum=(int) (sum+fact);
			no=no/10;
			
		}
		if(temp==sum) {
			System.out.println("Given no is Strong no");
		}
		else {
			System.out.println("non-strong no");
		}
	}

}
