package com.deloitte;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		primen();

	}

	private static void primen() {
	System.out.println("Enter the number");
    Scanner scan  = new Scanner(System.in);
    int num = scan.nextInt();
    int cnt = 0;
    for(int i =1; i<=num ; i++) {
    	if(num%i == 0) {
    		cnt=cnt+1;
    	}
    }
    
    if(cnt == 2 ) {
    	System.out.println("The number is prime : " +(cnt == 2));
    }
    else {
    	System.out.println("The number is prime : " +(cnt == 2));
    }
		
		
	}

}

