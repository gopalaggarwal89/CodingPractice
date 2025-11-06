package leetcode.easy.array;

import leetcode.util.ScannerUtil;

public class MoveZero
{
    /**
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     * @param args
     */
    public static void main(String[] args)
    {
        int[] arr = { 0, 1, 0, 3, 0 };

        int pnt1 = -1;
        int pnt2 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && pnt1 == -1) {
                pnt1 = i;
            }
            if (arr[i] != 0) {
                pnt2 = i;
            }

            if (pnt1 < pnt2 && pnt1 != -1 && arr[pnt2] != 0) {
                int temp = arr[pnt1];
                arr[pnt1] = arr[pnt2];
                arr[pnt2] = temp;
                pnt1++;
            }
        }

        ScannerUtil.printIntArray(arr);
    }
}
