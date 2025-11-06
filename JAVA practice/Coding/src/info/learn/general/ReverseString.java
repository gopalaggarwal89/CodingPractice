package info.learn.general;

import java.util.LinkedList;
import java.util.List;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "manikant";
		
		
		System.out.println(reverseWithIteration(str));
		System.out.println(reverseByPari(str));
		
	}
	
	private static String reverseWithIteration(String str) {
		int startIndex = 0;
		int endIndex = str.length() - 1;
		char[] data = str.toCharArray();
		while(startIndex <= endIndex) {
			char temp = data[startIndex];
			data[startIndex] = data[endIndex];
			data[endIndex] = temp;
			startIndex ++;
			endIndex --;		
		}
		
		return String.valueOf(data);
	}

	private static String reverseByPari(String str)
	{

		if (str.length() == 1)
			return str;

		return str.charAt(str.length() - 1) + reverseByPari(str.substring(0, str.length() - 1));

	}
}
