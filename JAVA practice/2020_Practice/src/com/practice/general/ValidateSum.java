package com.practice.general;

import java.util.HashSet;

public class ValidateSum {
	
	/**
	 * Input will be an sorted array, we need to find if it contains the sum or pair
	 * 
	 * e.g: 8
	 * 
	 * {1 , 2 , 3, 9} - NO
	 * {1 , 2 , 4, 4} - YES
	 * @param args
	 */
	public static void main (String[] args) {
		
		boolean found = false;
		found = unsortedArray();
		print(found);
		found = sortedArray();
		print(found);
		
	}

	private static void print(boolean found) {
		if(found) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

	private static boolean unsortedArray() {
		int a[] = {1, 2 , 3, 9, 5};
		int value = 8;
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int i = 0; i < a.length ; i ++) {
			int temp;
			int currentVal = a[i];
			
			if(value > currentVal) {
				temp = value - currentVal;
			}else {
				temp = currentVal- value;
			}
			
			if(hashSet.contains(currentVal)) {
				return true;
			}else {
				hashSet.add(temp);
			}
		}
		
		return false;
	}

	private static boolean sortedArray() {
		int a[] = {1, 2 , 3, 9 , 5};
		int value = 8;
		
		int i = 0;
		int j = a.length - 1;
		while(j >= 0) {
			int temp = a[i] + a[j];
			
			if(temp > value) {
				j --;
			}else if (temp < value) {
				i ++;
			}else {
				return true;
			}			
		}
		
		return false;
	}

}
