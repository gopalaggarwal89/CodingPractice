package leetcode.easy.array;

import leetcode.util.ScannerUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate
{
    /**
     * Identify if int[] contains duplicate or not
     * Input: nums = [1,2,3,1]
     * Output: true
     * Input: nums = [1,2,3,4]
     * Output: false
     */
    public static void main(String[] args)
    {
        int[] arr = ScannerUtil.getIntArray();

        System.out.println(Solution1(arr));
        System.out.println(Solution2(arr));
    }

    /**
     * First sort the array, then compare next element same or not
     */
    private static boolean Solution1(int[] arr)
    {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int pos = i + 1;
            if (pos != arr.length && arr[i] == arr[pos]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Use hashset
     */
    private static boolean Solution2(int[] nums)
    {
        int length = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            int val = nums[i];
            if (set.contains(val)) {
                return true;
            }
            else {
                set.add(val);
            }

        }
        return false;
    }
}
