class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 0;i<prices.length ;i++){
            if(prices[i] < minPrice){
                minPrice = prices[i]; //update minimum price
            }
            else {
                int profit = prices[i] - minPrice; //profit if sold today
                if(profit > maxProfit){
                    maxProfit = profit; //update max profit
                }
            }
        }
        return maxProfit;
    }
}