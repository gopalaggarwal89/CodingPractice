package leetcode.easy.array;

import leetcode.util.ScannerUtil;

public class RemoveAndMoveDuplicate
{
    /**
     * Input - [0,1,1,1,2,2,2,3,3,4]
     * Soln  - [0,1,2,3,4,1,1,2,2,3]
     * O/p   - 5
     *
     * @param args
     */
    public static void main(String[] args)
    {
        int nums[] = ScannerUtil.getIntArray();

        int index = 1;
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            int pos = i + 1;
            if (pos != length && nums[i] != nums[pos]) {
                nums[index] = nums[pos];
                index++;
            }
        }

        System.out.println(index);

    }
}
