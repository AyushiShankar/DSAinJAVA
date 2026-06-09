package Arrays;

public class maxProfitStock {
     public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
       System.out.println(maxProfit(nums));

     }


     public static int maxProfit(int[] prices) {
        int right = 0;
        int max = 0;
        int low = prices[0];
        while (right < prices.length) {
            if (prices[right] < low) {
                low = prices[right];
            } else {
                int profit = prices[right] - low;
                max = Math.max(profit, max);
            }

            right++;
        }

        return max;
    }
    
}
