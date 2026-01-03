package com.bridepath.percentage;

import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double math;
		System.out.println("Enter the Marks of Math:");
		math=sc.nextDouble();
		
		double phy;
		System.out.println("Enter the marks of phy:");
		phy=sc.nextDouble();
		
		double chem;
		System.out.println("Enter the marks of chem:");
		chem=sc.nextDouble();
		
		double bio;
		System.out.println("Enter the marks of bio:");
		bio=sc.nextDouble();
		
		double geo;
		System.out.println("Enter the marks of geo:");
		geo=sc.nextDouble();
		
		double sum=math+phy+chem+bio+geo;
		double avg=sum/5;
		
		System.out.println("Your Percentage is:"+avg);
	}

}
