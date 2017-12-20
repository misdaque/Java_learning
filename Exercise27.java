package com.misdaque.basic;

import java.util.Scanner;

//Conversion: Octal to Hexadecimal

public class Exercise27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int OctalNum, DecimalNum = 0, remainder, j = 0;
		System.out.print("Enter the Octal Number: ");
		OctalNum = input.nextInt();

		while (OctalNum != 0) {

			remainder = OctalNum % 10;
			DecimalNum = DecimalNum + (int) (remainder * Math.pow(8, j++));
			OctalNum /= 10;
		}
		
		String Hex[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
		String Val[]=new String[16];
		int index, i=0;
		
		while(DecimalNum>=16) {
			index=DecimalNum%16;
			DecimalNum=DecimalNum/16;
			Val[i++]=Hex[index];
			
		}
		if(DecimalNum<16)
			Val[i]=Hex[DecimalNum];
		System.out.print("The Hexadecimal Value of the Octal number is: ");
		for(;i>=0;i--) {
			System.out.print(Val[i]);
		}

	}

}
