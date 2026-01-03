package com.bridepath.percentage;

import java.util.Scanner;

public class while13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;
		System.out.println("Enter a no:");
		no=sc.nextInt();
		
		int add=0,mul=1;
		while(no>0) {
			int rem=no%10;
			add=add+rem;
			mul=mul*rem;
			no=no/10;
		}
		if(add==mul) {
			System.out.println("Given no is Spy no");
			
		}
		else {
			System.out.println("Given no is not Spy no");
		}
	}

}
