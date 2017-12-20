package com.misdaque.basic;

import java.util.Scanner;

public class Exercise11 {
		public static void main(String[] args) {
		
		Scanner take = new Scanner(System.in);
				
		System.out.print("Enter the radius of the circle : ");
		double radius = take.nextDouble();
		System.out.println("Perimeter of the Circle is " +(2*Math.PI*radius));
		System.out.println("Area of the circle is " +(Math.PI*radius*radius));
		
		
		
	}

}
