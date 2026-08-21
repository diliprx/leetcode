class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int step1=cost[0];
        int step2=cost[1];
        for(int i=2;i<cost.length;i++){
            int cur=cost[i]+Math.min(step1,step2);
            step1=step2;
            step2=cur;
        }
        return Math.min(step1,step2);
    }
}