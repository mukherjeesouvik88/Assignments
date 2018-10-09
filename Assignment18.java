package com.deloitte;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class Assignment18 {
	static int[] intArr = {12, 34, 56, 234, 111, 11, 22, 45};
	static List<Integer>	integerList = new CopyOnWriteArrayList<>();
	static List<Integer>	integerList2 = new CopyOnWriteArrayList<>();
	static List<Integer>	integerList3 = new CopyOnWriteArrayList<>();
	
	public static void main(String[] args) {
		NatNum();
	}

	private static void NatNum() {
		
		
		
		
		for(int i =0;i<intArr.length;i++) {
			if(intArr[i]<100) {
				int a = intArr[i]%10;
				int b = intArr[i]/10;
				int c= a + b;
				integerList2.add(c);
				integerList.add(c);
			}
			else {
				int a = intArr[i]%100;
				int d = a%10;
				int e = a/10;
				int b = intArr[i]/100;
				int c= d + e + b;
				integerList.add(c);
				integerList2.add(c);
			}
		}
		System.out.println("Unsorted list: " +integerList);
		Collections.sort(integerList);
		System.out.println("Sorted list: " +integerList);
		
		Integer[] unsorted = integerList2.toArray(new Integer[integerList2.size()]);
		Set<Integer> hs = new HashSet<>();
		hs.addAll(integerList);
		integerList.clear();
		integerList.addAll(hs);
		Integer[] sorted = integerList.toArray(new Integer[integerList.size()]);
		
		for(int i = 0;i< sorted.length;i++) {
			
			for(int j =0;j<integerList2.size();j++) {
				
				if(sorted[i]==unsorted[j]) {
					integerList3.add(intArr[j]);
				}
				
			}
		}
		System.out.println("Final sort: "+integerList3);
		
			
			
		}
		
		
		
		
	}

	


