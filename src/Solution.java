class Solution {
    public int maxProfit(int[] prices) {
        // Initialize variables to store the minimum price and maximum profit
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Iterate through the array of prices
        for (int price : prices) {
            // Update the minimum price encountered so far
            if (price < minPrice) {
                minPrice = price;
                // Calculate the potential profit if we sell at the current price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    // Example test cases
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // Output: 5
        System.out.println(solution.maxProfit(new int[]{7, 6, 4, 3, 1}));   // Output: 0
    }
}
