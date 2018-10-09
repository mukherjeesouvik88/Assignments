package com.deloitte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment3 {

	private static int takeInputA() {

		try {
			System.out.println("Enter A");
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			return a;
		} catch (InputMismatchException e) {
			System.out.println("Enter numbers only");
			System.out.println("Enter A");
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();

			return a;
		}

	}

	private static int takeInputB() {
		
		try {
			System.out.println("Enter B");
			Scanner scan = new Scanner(System.in);
			int b = scan.nextInt();
			return b;
		} catch (InputMismatchException e) {
			System.out.println("Enter numbers only");
			System.out.println("Enter B");
			Scanner scan = new Scanner(System.in);
			int b = scan.nextInt();

			return b;
		}

	}
	
	
	private static int Calculate(int a, int b) {
		int c = 0;
		try {
		System.out.println("1 = add, 2 = sub, 3 = mul, 4 = div");
		Scanner scan = new Scanner(System.in);
		int sel = scan.nextInt();
		
		switch (sel) {
		case 1:
			 c = a+b;
			 System.out.println("Sum of " +a+ "&" +b+ "is" +c);
			break;
		case 2:
			c = a-b;
			 System.out.println("Diff of " +a+ "&" +b+ "is" +c);
			break;
		case 3:
			c = a*b;
			 System.out.println("Product of " +a+ "&" +b+ "is" +c);
			break;
		case 4:
			double d = a/b;
			 System.out.println("Quotient of " +a+ "&" +b+ "is" +d);
			break;
		default:
			System.out.println("Enter correct choice");
			break;
		}
		}catch(InputMismatchException e) {
			System.out.println("Enter a value from 1-4");
		}
		
		return c;
		
	}

  	

	public static void main(String[] args) {
		int a = takeInputA();
		int b = takeInputB();
		  Calculate(a,b);

	}

	

}