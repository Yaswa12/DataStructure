//Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell



public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0; // No profit if no prices are provided
        }

        int minPrice = Integer.MAX_VALUE; // Initialize to a very large value
        int maxProfit = 0; // Initialize maximum profit to 0

        // going around price array
        for (int i = 0; i < prices.length; i++) {
            // If the current price is lower than the minimum price, update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Otherwise, calculate the potential profit if we sell on this day
            else {
                int profit = prices[i] - minPrice;
                // Update maxProfit if this profit is larger than the current maxProfit
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit; // Return the maximum profit we found
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(solution.maxProfit(prices)); // Output: 5
    }
}
