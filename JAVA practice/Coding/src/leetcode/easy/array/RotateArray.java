package leetcode.easy.array;

import leetcode.util.ScannerUtil;

public class RotateArray
{
    /**
     * Input: nums = [1,2,3,4,5,6,7], k = 3
     * Soln:
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
     * Output: [5,6,7,1,2,3,4]
     *
     * Input: nums = [-1,-100,3,99], k = 2
     * Soln:
     * rotate 1 steps to the right: [99,-1,-100,3]
     * rotate 2 steps to the right: [3,99,-1,-100]
     * Output: [3,99,-1,-100]
     * @param args
     */
    public static void main(String[] args)
    {
        int[] nums = ScannerUtil.getIntArray();
        int length = nums.length;

        // Performance improvement
        int k = ScannerUtil.getInt();

        k = k % length;

        // This loop will execute number of rotation
        while (k > 0){
            // Rotation logic
            for(int i = length - 1; i >= 0; i--){
                int pos = i - 1;
                if(pos != -1 && pos != length){
                    int temp = nums[i];
                    nums[i] = nums[pos];
                    nums[pos] = temp;
                }
            }
            k --;
        }

        ScannerUtil.printIntArray(nums);
    }
}
