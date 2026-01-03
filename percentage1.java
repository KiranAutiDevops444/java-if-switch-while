package com.bridepath.percentage;

import java.util.Scanner;

public class percentage1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int phy;
		System.out.println("Enter the marks of phy:");
		phy=sc.nextInt();
		
		int chem;
		System.out.println("Enter the marks of chem:");
		chem=sc.nextInt();
		
		int math;
		System.out.println("Enter the marks of math:");
		math=sc.nextInt();
		
		int bio;
		System.out.println("Enter the marks of bio:");
		bio=sc.nextInt();
		
		int geo;
		System.out.println("Enter the marks of geo:");
		geo=sc.nextInt();
		
		int sum=phy+chem+math+bio+geo;
		int avg=sum/5;
		
		if(avg<=100 && avg>=90) {
			System.out.println("Grade:O");
		}
		else if(avg<=89 && avg>=80) {
			System.out.println("Grade:A+");
		}
		else if(avg<=79 && avg>=70) {
			System.out.println("Grade:A");
		}
		else if(avg<=69 && avg>=60) {
			System.out.println("Grade:B+");
		}
		else if(avg<=59 && avg>=50) {
			System.out.println("B");
		}
		else if(avg<=49 && avg>=40) {
			System.out.println("Grade:Pass");
		}
		else if(avg<39) {
			System.out.println("YOu are fail Try naxt year");
		}
		
		
	}

}
