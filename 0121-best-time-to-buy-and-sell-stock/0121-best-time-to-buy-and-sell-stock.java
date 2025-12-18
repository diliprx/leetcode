class Solution {
    public int maxProfit(int[] prices) {
        int a=0;
        int b=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<b){
                b=prices[i];
            }
            else if(prices[i]-b>a){
                a=prices[i]-b;
            }
        }
        return a;
    }
}