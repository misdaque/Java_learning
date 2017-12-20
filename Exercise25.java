package com.misdaque.basic;

import java.util.Scanner;

//Conversion: Octal to Decimal

public class Exercise25 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int OctalNum,DecimalNum=0,remainder,j=0;
		System.out.print("Enter the Octal Number: ");
		OctalNum= input.nextInt();
		
		while(OctalNum!=0) {
			
			remainder= OctalNum%10;
			DecimalNum = DecimalNum + (int) (remainder*Math.pow(8, j++));
			OctalNum/=10;
		  
		}
		System.out.println("Binary Number is "+DecimalNum);
	}

}
