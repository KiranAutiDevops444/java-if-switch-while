package com.bridepath.percentage;

import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int math;
		System.out.println("Enter the marks of Math:");
		math=sc.nextInt();
		
		int phy;
		System.out.println("Enter the marks of phy:");
		phy=sc.nextInt();
		
		int chem;
		System.out.println("Enter the marks of chem:");
		chem=sc.nextInt();
		
		int Geo;
		System.out.println("Enter the marks of Geography:");
		Geo=sc.nextInt();
		
		int Bio;
		System.out.println("Enter the marks of Biology:");
		Bio=sc.nextInt();
		
		int sum=math+phy+chem+Geo+Bio;
		double avg=sum/5;
		
		System.out.println("Your Percentage is="+avg);
		
		
	}

}
