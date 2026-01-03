package com.bridepath.percentage;




public class volume1 {
	double height =10;
	double width=20;
	double depth=10;
	
	public  double volume() {
		
		return height*width*height;
	}
	
	public static void main(String[] args) {
		volume1 b=new volume1();
		System.out.println("Volume:"+b.volume());
	}
 
}
