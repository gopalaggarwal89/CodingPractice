package leetcode.easy.array;

import leetcode.util.ScannerUtil;

public class PlusOne
{
    public static void main(String[] args)
    {
        int[] array = { 9 };

        getPlusOne(array);
    }

    private static void getPlusOne(int[] array)
    {
        int length = array.length;

        int carry = 0;
        for (int i = length - 1; i >= 0; i--) {
            int sum = array[i] + 1;
            carry = 0;
            if (sum >= 10) {
                sum = sum % 10;
                carry = 1;
            }
            array[i] = sum;
            if (carry > 0) {
                continue;
            }
            else {
                break;
            }
        }

        if(carry == 1 && array[0] == 0){
            int[] arr = new int[length+1];
            arr[0] = 1;
            for(int i=0; i<length; i++){
                arr[i+1] = array[i];
            }

            ScannerUtil.printIntArray(arr);
        }

        System.out.println("\n");
        ScannerUtil.printIntArray(array);
    }

}
