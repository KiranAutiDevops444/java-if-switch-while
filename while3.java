package com.bridepath.percentage;

import java.util.Scanner;

public class while3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no1;
		System.out.println("Enter Starting:");
		no1=sc.nextInt();
		
		
		
		int i=1;
		while(i<=10) {
			System.out.println(no1 +"*"+i+"="+(no1*i));
			i++;
		}
	}

}
