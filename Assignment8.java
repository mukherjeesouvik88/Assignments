package com.deloitte;

public class Assignment8 {
	
	public static void main(String[] args) {
		SumAtPrime();
	}

	private static void SumAtPrime() {
		int[] s1 = {0,1,2,3,4,5,6,7,8,9,10};
		
		int c = 0;
		int sum = 0;
		
		int i = 1;
		
		while(i < s1.length) {
		
		c = PrimeIndex(i);
		
		
		sum = sum+s1[c];
		
		i++;
		}
		
		System.out.println(sum);
		
	}

	private static int PrimeIndex(int i) {
		int cnt = 0;
		int x = 0;
		for(int a = 1;a<=i;a++) {
			if(i%a==0) {
				 cnt++;
			}
		}
		if(cnt==2) {
			x= i;
		}
		return x;
	}

}
