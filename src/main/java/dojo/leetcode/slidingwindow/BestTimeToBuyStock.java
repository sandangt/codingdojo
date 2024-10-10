package dojo.leetcode.slidingwindow;

/**
 * easy
 * url: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyStock {
    static int solution(int[] prices) {
        int left = 0, right = 1, maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] >= prices[right]) {
                left = right;
                ++right;
            } else {
                maxProfit = Math.max(maxProfit, prices[right++] - prices[left]);
            }
        }
        return maxProfit;
    }
}
