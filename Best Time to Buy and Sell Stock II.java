class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        boolean flag = true;
        int buy =0;
        for(int i=0;i<prices.length-1;i++){
            if(flag && prices[i]<prices[i+1]){
                buy = prices[i];
                flag = false;
            }
            
            if(!flag && prices[i]>prices[i+1]){
                profit += prices[i] - buy;
                flag = true;
            }
        }
        if(!flag){
            profit += prices[prices.length-1] - buy;
        }
        
        return profit;
    }
}