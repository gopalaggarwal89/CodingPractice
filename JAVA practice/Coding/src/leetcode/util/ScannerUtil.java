package leetcode.util;

import java.util.List;
import java.util.Scanner;

public class ScannerUtil
{
    public static int[] getIntArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            //reading array elements from the user
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static char[] getCharArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        char[] array = new char[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            //reading array elements from the user
            array[i] = sc.next().charAt(0);
        }
        return array;
    }

    public static int getInt()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter intput : ");
        return sc.nextInt();
    }

    public static String getString()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter intput : ");
        return sc.next();
    }

    public static void printIntArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] listToArrayInt(List<Integer> list)
    {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
