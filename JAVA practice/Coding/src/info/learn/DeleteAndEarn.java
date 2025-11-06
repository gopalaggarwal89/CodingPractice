package info.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteAndEarn {

	
	public static void main(String[] args) {

		int[] intArray = { 3, 4, 2 };
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(4);
		arr.add(2);

		Arrays.sort(intArray);

		int value = earning(intArray, 0, intArray.length - 1);
		System.out.println(value);
	}

	static int earning(int[] sorted, int earnings, int max) {

		System.out.println("earnings " + earnings + " max " + max);
		int count = earnings;
		
		int length = max;

		if (length != -1) {

			int check = 0;
			int lastIndex = 1;
			int delete = sorted[length];
			for (int i = length; i >= 0; i--) {
				int next = sorted[i];
				if ((delete - 1) == next) {
					if (check == 0) {
						count = count + next;
						check = 1;
					}
					lastIndex++;
				}
			}
			lastIndex = lastIndex - 1;
			earning(sorted, count, length - lastIndex);
				
			}

		
		return count;
	}
}
