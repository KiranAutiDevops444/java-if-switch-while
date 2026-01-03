package com.bridepath.percentage;

import java.util.Scanner;

public class hour {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int hour;
		System.out.println("Enter the hour that you want to convert in min and sec:");
		hour=sc.nextInt();
		
		int min;
		min=hour*60;
		System.out.println("hour to min conversion:"+min);
		
		int sec;
		sec=hour*3600;
		System.out.println("hour to Sec conversion:"+sec);
		
	}

}
