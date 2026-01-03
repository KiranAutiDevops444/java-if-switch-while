package com.bridepath.percentage;

import java.util.Scanner;

public class ifelse8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double no;
		System.out.println("Enter any no:");
		no=sc.nextDouble();
		
		//if(no==0 || no==1 || no==2 || no==3 || no==4 || no==5 || no==6 || no==7 || no==8 || no==9
		//		 || no==-1 || no==-2 || no==-3 || no==-4 || no==-5 || no==-6 || no==-7 || no==-8 || no==-9)
		//if(no%4==0 && no%100!=0  || no%400==0){
		if(no>=0 && no<=9 || no<=0 && no>=-9) {
			
			System.out.println("THis year is  leap year");
		}
		else {
			System.out.println("This year is not leap year");
		}
			
		
	}

}
