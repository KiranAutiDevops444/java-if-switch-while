package com.bridepath.percentage;

import java.util.Scanner;

public class ifelse7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int age;
		System.out.println("Enter Your Age:");
		age=sc.nextInt();
		
		if(age>=21) {
			System.out.println("You are eligible for ladki bahin yojna");
			
		}
		else {
			System.out.println("You are not eligible for ladki bahin Yojna");
		}
	}

}
