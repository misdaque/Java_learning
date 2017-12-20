package com.misdaque.basic;

import java.util.Scanner;

//Compute Area of Hexagon

public class Exercise34 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the length of a side of a Hexagon ");
		double length = input.nextDouble();
		double area =(6*Math.pow(length, 2)/(4*Math.tan(Math.PI/6)));
		System.out.print("Area of the Hexagon is  "+area);
	}

}
