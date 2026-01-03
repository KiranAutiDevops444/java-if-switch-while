package com.bridepath.percentage;

import java.util.Scanner;

public class Intrest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double ammount;
		System.out.println("Enter the ammount:");
		ammount=sc.nextDouble();
		
		double year;
		System.out.println("Enter the years:");
		year=sc.nextDouble();
		
		double Rate;
		System.out.println("Enter the Rate of Intrest:");
		Rate=sc.nextDouble();
		
		double total=(ammount*year*Rate)/100;
		
		double SimpleIntrest=ammount+total;
		
		System.out.println("Your ammount with simple Intrest is :"+SimpleIntrest);
		
		
		
	}

}
