package leetcode.easy.array;

import leetcode.util.ScannerUtil;

import java.util.Map;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 */
public class TwoSum
{
    /**
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     * Input: nums = [-3,4,3,90], target = 0
     * Output: [0,2]
     * Input: nums = [-1,-2,-3,-4,-5], target =-8
     * Output: [2,4]
     */
    public static void main(String[] args)
    {
        int[] array = ScannerUtil.getIntArray();
        int target = ScannerUtil.getInt();

        twoSum(array, target);
    }

    private static void twoSum(int[] arr, int target)
    {
        int indexArray[] = new int[2];
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int value = arr[i];
            int key = target - value;
            int index = findElementIndex(arr, i + 1, length, key);
            if (index != -1) {
                indexArray[0] = i;
                indexArray[1] = index;
                break;
            }
        }

        ScannerUtil.printIntArray(indexArray);
    }

    private static int findElementIndex(int[] arr, int startIndex, int length, int key)
    {
        for (int i = startIndex; i < length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
