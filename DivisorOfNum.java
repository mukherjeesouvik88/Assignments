package com.deloitte;

public class DivisorOfNum {

	public static void main(String[] args) {
		divi(50);

	}

	private static void divi(int i) {
		
		 int j=0;
		 
		 for(int a=1;a<=50;a++) {
			 if(i%a==0) {
				 System.out.println(a);
			 }
		 }
	}

}
