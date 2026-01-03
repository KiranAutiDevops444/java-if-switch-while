package com.bridepath.percentage;

 class box {
	double height=10;
	double width=20;
	double depth=10;
	
	

}
class volume{
	public static void main(String[] args) {
	box b=new box();
		
		double volume=b.height*b.depth*b.width;
		
		System.out.println("volume of the box is:"+volume);
	}
}
