package com.misdaque.basic;

import java.util.Scanner;

//Compare two Integers

public class Exercise32 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int FirstNum,SecondNum;
		System.out.print("Enter the First Number: ");
		FirstNum = input.nextInt();
		System.out.print("Enter the Second Number: ");
		SecondNum = input.nextInt();
		
		if(FirstNum==SecondNum)
			System.out.println(FirstNum +" = "+SecondNum);
		else 
			System.out.println(FirstNum +" != "+SecondNum);
		if(FirstNum<SecondNum)
			System.out.println(FirstNum +" < "+SecondNum);
		else
			System.out.println(FirstNum +" > "+SecondNum);
		
	}

}
