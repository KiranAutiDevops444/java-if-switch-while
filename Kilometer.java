package com.bridepath.percentage;

import java.util.Scanner;

public class Kilometer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double kilo;
		System.out.println("Enter kilometer that you want to convert in meter or cm:");
		kilo=sc.nextDouble();
		
		double meter;
		meter=kilo*1000;
		System.out.println("kilometer to meter conversion:"+meter);
		
		double cm;
		cm=kilo*100000;
		System.out.println("kilometer to cm conversion:"+cm);
		
	}

}
