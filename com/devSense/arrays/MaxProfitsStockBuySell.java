package com.devSense.arrays;

/**
 * Given an array prices[] of size n denoting the cost of stock on each day, the task is to find the maximum total profit if we can buy and sell the stocks any number of times.
 * <p>
 * Note: We can only sell a stock which we have bought earlier and we cannot hold multiple stocks on any day.
 * <p>
 * Input: prices[] = {100, 180, 260, 310, 40, 535, 695}
 * Output: 865
 * Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
 * Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655
 * Maximum Profit  = 210 + 655 = 865
 * <p>
 * <p>
 * Input: prices[] = {4, 2, 2, 2, 4}
 * Output: 2
 * Explanation: Buy the stock on day 3 and sell it on day 4 => 4 – 2 = 2
 * Maximum Profit  = 2
 * <p>
 * Naive Approach] Using Recursion – Exponential Time
 * We consider every valid pair (A pair of indexes i and j such that price[i] < price[j] and j > i),
 * we get the profit of the pair as (price[j] – price[i]) and add recursively compute profits for i-1 and j+1.
 * Finally we return the maximum of all profits obtained by all valid pairs.
 */
public class MaxProfitsStockBuySell {

    public static int maxProfitPair(int[] priceList, int start, int end) {
        int res = 0;

        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (priceList[j] > priceList[i]) {
                    int curr = priceList[j] - priceList[i] + maxProfitPair(priceList, start, i - 1) + maxProfitPair(priceList, j + 1, end);

                    res = Math.max(curr, res);
                }
            }
        }

        return res;
    }

    static int WrapperMaxProfit(int[] prices) {
        return maxProfitPair(prices, 0, prices.length - 1);
    }


    public static void main(String[] args) {

        System.out.println("Hello World!");
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        int maxProfit = WrapperMaxProfit(prices);
        System.out.println("Profit will be maximized: " + maxProfit);

    }
}
