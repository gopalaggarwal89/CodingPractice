package leetcode.easy.array;

public class LargestInOneSwap
{
    /**
     * MatrixMazeProblem case : 98368 -> 98863
     * 10909091 -> 90909011
     * 115 -> 511
     * 2736 -> 7236
     *
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println(maximumOneSwap(2736));
    }

    private static int maximumOneSwap(int num)
    {
        String temp = Integer.toString(num);
        int length = temp.length();
        int[] data = new int[length];
        for (int i = 0; i < length; i++) {
            data[i] = temp.charAt(i) - '0';
        }

        int smallValueIndex = -1;
        int largeValueIndex = -1;

        boolean check = true;
        for (int i = 0; i < length; i++) {
            int pos = i + 1;

            // set smallValueIndex which is smaller than largeValueIndex Value
            if (pos != length && data[i] < data[i + 1] && check) {
                smallValueIndex = i;
                largeValueIndex = pos;
                check = Boolean.FALSE;
            }

            //Check if there is any value greater than previous
            //Change the largeValueIndex
            if (pos != length && largeValueIndex != -1 && data[largeValueIndex] < data[pos]) {
                largeValueIndex = pos;
            }
        }

        if (smallValueIndex != -1 && largeValueIndex != -1) {

            //Minimum value founded first position
            for (int i = 0; i < length; i++) {
                if (data[smallValueIndex] == data[i]) {
                    smallValueIndex = i;
                    break;
                }
            }

            //Maximum value last position
            for (int i = 0; i < length; i++) {
                if (data[largeValueIndex] == data[i]) {
                    largeValueIndex = i;
                }
            }

            //If 0 index value is smaller then smallValueIndex
            //Or it is less than maxVal, then maxValue must be swapped with smallValueIndex
            if ((data[0] == 1 && smallValueIndex != 0) || data[0] < data[largeValueIndex]) {
                smallValueIndex = 0;
            }

            //Swap
            int value = data[smallValueIndex];
            data[smallValueIndex] = data[largeValueIndex];
            data[largeValueIndex] = value;
        }

        String value = "";

        for (int i = 0; i < length; i++) {
            value = value + Integer.toString(data[i]);
        }

        return Integer.valueOf(value);
    }
}
