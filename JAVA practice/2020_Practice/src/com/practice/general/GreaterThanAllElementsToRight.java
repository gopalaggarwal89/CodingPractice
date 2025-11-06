package com.practice.general;

/**
 * Find All elements in an array that are greater than all elements present to their right
 *
 */
public class GreaterThanAllElementsToRight {
	
	/**
	 * I/P - {10 , 4, 6, 3 ,5}
	 * O/P - 10 , 6 , 5
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int arr[] = {10 , 4, 6, 3 ,5 , 7};
		
		maxSoFar(arr);
		
	}

	private static void maxSoFar(int[] arr) {
		int max_so_far = 0;
		for(int i=arr.length - 1; i>=0; i--) {
			
			if(arr[i] > max_so_far) {
				
				max_so_far = arr[i];
				System.out.println(max_so_far);
				
			}
			
		}
	}

}
