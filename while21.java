package com.bridepath.percentage;

import java.util.Scanner;

public class while21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;
		System.out.println("Enter a no:");
		no=sc.nextInt();
		
		int temp=no;
		boolean isautomorphic=true;
		int lastDigit=0;
		int square=no*no;
		int squlastDigit=0;
		
		while(temp>0) {
			lastDigit=temp%10;
			squlastDigit=square%10;
			
		if(lastDigit != squlastDigit) {
			isautomorphic=false;
			break;
			
			
		}
		temp=temp/10;
		square=square/10;
		
		
		
		}
		if(isautomorphic) {
			System.out.println("the no is Automorphic");
			
		}
		else {
			System.out.println("no is not Automorphic");
		
		}
	}

}
