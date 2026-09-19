class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minPrices=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            if(prices[i]<minPrices){
                minPrices=prices[i];
            }
            int profit=prices[i]-minPrices;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}