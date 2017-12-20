package com.misdaque.basic;

import java.util.Scanner;

//Compute Area of the Polygon

public class Exercise35 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the Number of Sides of the Polygon: ");
		int SideNum = input.nextInt();
		System.out.print("Enter the length of the side of the Polygon: ");
		double SideLength = input.nextDouble();
		double area = (SideNum*Math.pow(SideLength, 2)/(4*Math.tan(Math.PI/SideNum)));
		System.out.print("Area of the Polygon is "+area);
		
	}

}
