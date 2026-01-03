package com.bridepath.percentage;

import java.util.Scanner;

public class ifelse9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char v;
		System.out.println("Enter the character:");
		v=sc.next().charAt(0);
		
		if(v=='a' || v=='e' || v=='i' || v=='o' ||v=='u' || v=='A' || v=='E' || v=='I' || v=='O' || v=='U') {
			System.out.println("Entered character is Vowel");
			
		}
		else {
			System.out.println("Entered Character is not Vowel");
		}
			
		
	}
}
