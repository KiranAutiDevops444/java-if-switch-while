package com.bridepath.percentage;

import java.util.Scanner;

public class ifselse10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		
		int day;
		System.out.println("Enter the no. between 1 to7:");
		day=sc.nextInt();
		
		if(day==1) {
			System.out.println("Sunday");
			
		}
		else if(day==2) {
			System.out.println("Monday");
			
		}
		else if(day==3) {
			System.out.println("thusday");
		}
		else if(day==4) {
			System.out.println("Wednesday");
		}
		else if(day==5) {
			System.out.println("Thesday");
			
		}
		else if(day==6) {
			System.out.println("Friday");
			
		}
		else if(day==7) {
			System.out.println("Saterday");
		}
		else {
			System.out.println("Invalid day");
		}
	}

}
