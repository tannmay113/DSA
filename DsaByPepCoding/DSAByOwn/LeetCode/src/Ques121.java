public class Ques121 {

    static class Solution {

        public static int maxProfit(int[] prices) {

            int max = 0;
            int minPrice = Integer.MAX_VALUE;

            for (int i = 0; i < prices.length; i++) {

                if (minPrice > prices[i]) {
                    minPrice = prices[i];
                }

                int profit = prices[i] - minPrice;
                if (profit > max) {
                    max = profit;
                }
            }
            return max;
        }
    }
    public static void main(String[] args) {

        int [] arr  = {7, 1,5,3,6,4};
        int result = Solution.maxProfit(arr);
        System.out.println(result);
    }
}
