package leetcode.easy.array;

import leetcode.util.ScannerUtil;

public class BestTimeToBuyAndSellStock
{
    /**
     * Input: prices = [7,1,5,3,6,4]
     * Output: 7
     * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
     * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
     *
     * Input: prices = [1,2,3,4,5]
     * Output: 4
     * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
     * Note that you cannot buy on day 1, buy on day 2 and sell them later,
     * as you are engaging multiple transactions at the same time. You must sell before buying again.
     *
     * Input: prices = [7,6,4,3,1]
     * Output: 0
     * Explanation: In this case, no transaction is done, i.e., max profit = 0.
     */
    public static void main(String[] args)
    {
        int[] prices = ScannerUtil.getIntArray();

        int  profit = 0;
        int length = prices.length;

        for(int i=0; i<length; i++){
            int pos = i + 1;
            if(pos != length && prices[i] < prices[pos]){
                int diff = prices[pos] - prices[i];
                profit += diff;
            }
        }

        System.out.println(profit);
    }
}
