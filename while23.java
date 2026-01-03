package com.bridepath.percentage;

import java.util.Scanner;

public class while23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;
		System.out.println("Enter a no:");
		no=sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<no;i++) {
			
		if(no%i==0) {
			sum=sum+i;
			
		}
		
	}
		if(sum==no) {
			System.out.println("Perfect no");
			
		}
		else {
			System.out.println("not a perfect no");
		}
	}
}
