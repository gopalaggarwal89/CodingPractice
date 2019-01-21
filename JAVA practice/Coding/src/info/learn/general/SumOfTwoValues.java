package info.learn.general;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfTwoValues {

	/**
	 * Input integer array, Output must return sum of two
	 * pair any two number sum must be 20
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = {7,6,12,3,9,3,5,1};
	List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<array.length;i++){
            list.add(array[i]);
        }
        Set<Long> set = new HashSet<Long>();
		for (int i = 0; i < array.length; i++) {
			int temp = 12 - array[i];
			if (list.contains(temp) && (temp > array[i] || temp == array[i]) && !set.contains(Long.valueOf(array[i]))) {
				set.add(Long.valueOf(array[i]));
				System.out.println(array[i] + " : " + temp);
			}
	}
		
		System.out.println(numberOfPairs(array, 12));
	}
	
	private static int numberOfPairs(int[] array,long k) {
		int count = 0;
        List<Long> list = new ArrayList<Long>();
        for(int i=0;i<array.length;i++){
            list.add(Long.valueOf(array[i]));
        }
        Set<Long> set = new HashSet<Long>();
		for (int i = 0; i < array.length; i++) {
			long temp = k - array[i];
			if (list.contains(temp) && (temp > array[i] || temp == array[i]) && !set.contains(Long.valueOf(array[i]))) {
				set.add(Long.valueOf(array[i]));
				count ++;
			}
		}
        return count;
	}
}
