public class 121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int buy = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(buy > prices[i]){
                buy = prices[i];
            }
            else if(profit < prices[i] - buy){
                profit = prices[i] - buy;
            }
        }
        return profit;
        
    }
}
