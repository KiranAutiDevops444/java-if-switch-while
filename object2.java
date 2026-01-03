package com.bridepath.percentage;

 class object1 {
	double height;
	double width;
	double depth;
	
	void volume() {
		double vol=height*width*depth;
		System.out.println("Volume:"+vol);
	}
	
	}
	


public class object2{
	public static void main(String[] args) {
		
		
		object1 b1=new object1();
		b1.height=10;
		b1.width=20;
		b1.depth=30;
		b1.volume();
		
		object1 b2=new object1();
		b2.height=11;
		b2.width=12;
		b2.depth=13;
		b2.volume();
	}
}
