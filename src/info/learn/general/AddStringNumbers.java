package info.learn.general;

import java.util.Scanner;

public class AddStringNumbers {

	/**
	 * Adding to big String integer numbers Input: 3213143412313 and 736182731123
	 * Output: both sum
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		int length1 = input1.length();
		int length2 = input2.length();
		int length = 0;
		if (length1 > length2) {
			length = length1;
			input2 = appendZero(input2, length1, length2);
		} else {
			length = length2;
			input1 = appendZero(input1, length2, length1);
		}
		char[] a1 = input1.toCharArray();
		char[] a2 = input2.toCharArray();

		StringBuilder sum = new StringBuilder();
		int carry = 0;
		for (int i = length - 1; i >= 0; i--) {
			int val1 = a1[i] - '0';
			int val2 = a2[i] - '0';
			int x = val1 + val2 + carry;

			if (x >= 10) {
				x = x - 10;
				carry = 1;
			} else {
				carry = 0;
			}
			sum.append(x);
		}
		
		if(carry == 1) {
			sum.append(1);
		}

		System.out.println(sum.reverse().toString());
		scanner.close();
	}

	private static String appendZero(String input, int length1, int length2) {
		int temp = length1 - length2;
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < temp; i++) {
			str.append("0");
		}
		return str + input;
	}

}
