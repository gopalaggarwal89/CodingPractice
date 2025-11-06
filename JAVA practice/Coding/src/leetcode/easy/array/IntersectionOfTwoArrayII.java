package leetcode.easy.array;

import leetcode.util.ScannerUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrayII
{
    /**
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2,2]
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [4,9]
     * Explanation: [9,4] is also accepted.
     */

    public static void main(String[] args)
    {
        int[] num1 = ScannerUtil.getIntArray();
        int[] num2 = ScannerUtil.getIntArray();

//        int[] finalResult = intersectArray(num1, num2, num1.length, num2.length);
        int[] finalResult = intersectArrayWithHashMap(num1, num2, num1.length, num2.length);

        ScannerUtil.printIntArray(finalResult);
    }

    private static int[] intersectArray(int[] num1, int[] num2, int num1Length, int num2Length)
    {
        if (num1 == null || num2 == null || num1Length == 0 || num2Length == 0) {
            return new int[0];
        }
        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        Arrays.sort(num1);
        Arrays.sort(num2);

        while (i < num1Length && j < num2Length) {
            if (num1[i] == num2[i]) {
                result.add(num1[i]);
                i++;
                j++;
            }
            else if (num1[i] < num2[i]) {
                i++;
            }
            else {
                j++;
            }
        }
        return ScannerUtil.listToArrayInt(result);
    }

    private static int[] intersectArrayWithHashMap(int[] num1,
        int[] num2,
        int num1Length,
        int num2Length)
    {

        Map<Integer, Integer> freqMap = new HashMap<>();
        int count = 1;
        for (int i = 0; i < num1Length; i++) {
            if (freqMap.containsKey(num1[i])) {
                count++;
            }
            else {
                count = 1;
            }
            freqMap.put(num1[i], count);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < num2Length; i++) {
            if (freqMap.containsKey(num2[i]) && freqMap.get(num2[i]) > 0) {
                int frequency = freqMap.get(num2[i]) - 1;
                freqMap.put(num2[i], frequency);
                result.add(num2[i]);
            }
        }
        return ScannerUtil.listToArrayInt(result);
    }
}
