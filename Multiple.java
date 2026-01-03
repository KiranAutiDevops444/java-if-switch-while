package com.bridepath.percentage;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;
		System.out.println("Enter any no:");
		no=sc.nextInt();
		
		if(no%3==0 && no%9==0) {
			System.out.println("Given no is Multiple of 3 as well as 9");
		}
		else {
			System.out.println("Given no is not nultiple of 3 and 9");
		}
	}

}
