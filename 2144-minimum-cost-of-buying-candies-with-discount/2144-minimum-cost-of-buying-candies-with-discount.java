class Solution {
    public int minimumCost(int[] cost) {
        int n=cost.length;
        int a=0,b=0;
        Arrays.sort(cost);
        for(int i=0;i<n;i++){
            a+=cost[i];
        }
        for(int i=n-3;i>=0;i-=3){
            b+=cost[i];
        }
        return a-b;
    }
}