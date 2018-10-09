package com.deloitte;

import java.util.Scanner;

public class PrimeSq {

	public static void main(String[] args) {
		primen();

	}

	private static void primen() {
		int num = 2;
	while(num<30) {
    int cnt = 0;
    for(int i =1; i<= num ; i++) {
    	if(num%i == 0) {
    		cnt=cnt+1;
    	}
    	 
    }
    
   if(cnt == 2 ) {
    	System.out.println(num*num);
    }
   num++;
	}
		
		
	}

}
