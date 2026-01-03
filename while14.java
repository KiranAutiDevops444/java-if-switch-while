package com.bridepath.percentage;

import java.util.Scanner;

public class while14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;
		System.out.println("Enter a no:");
		no=sc.nextInt();
		
		int sum=0;
		int ori=no;
		while(no>0) {
			
			
			sum=sum+no%10;
			//sum=sum+rem;
			no=no/10;
		}
		if(ori%sum==0) {
			System.out.println("Given no is Harshad no");
			
		}
		else {
			System.out.println("Given no is not Harshad no");
		}
	}

}
