class Solution {
    public int maxProfit(int[] prices) {
        int cheapest = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            int currProfit = prices[i]-cheapest;
            cheapest = Math.min(cheapest, prices[i]);
            maxProfit = Math.max(currProfit, maxProfit);
        }

        return maxProfit;
    }
}
