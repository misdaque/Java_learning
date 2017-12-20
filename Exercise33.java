package com.misdaque.basic;

import java.util.Scanner;

//Sum Of the Digits

public class Exercise33 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a dogit: ");
		int Digit=input.nextInt();
		int Sum=0;
		while(Digit!=0)
		{
			Sum= Digit%10+Sum;
			Digit/=10;
		}
		System.out.print("Sum of the dogit is "+Sum);
	}

}
