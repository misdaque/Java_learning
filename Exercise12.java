package com.misdaque.basic;

import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter value of 'a' : ");
		double a= input.nextDouble();
		System.out.print("Enter the value of 'b' : ");
		double b= input.nextDouble();
		System.out.print("Enter the value of 'c' : ");
		double c= input.nextDouble();
		double average=(a+b+c)/3;
		System.out.printf("Average (a+b+c)/3 = %.1f \n", average);
		
		
	}

}
