package com.misdaque.basic;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter the value of First No 'a' : ");
			int a = input.nextInt();
			System.out.print("Enter the value of Second No 'b' : ");
			int b = input.nextInt();
			System.out.println("Multiplication of 'a' and 'b' is : " + (a * b));
			
			int c, d;
			//for(int i=0; i<args.length;i++) {
				//System.out.println(args[i]);
				c= Integer.valueOf(args[0]);
				d= Integer.valueOf(args[1]);
				System.out.println(c+d);
			

		} 
		finally {

			input.close();
		}

	}

}
