class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double kd=(double)k;
        double b=-Double.MAX_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            int j=i+k-1;
            int a=0;
            for(int m=i;m<=j;m++){
                a+=nums[m];
            }
            double cur=(double)a/kd;
            b=Math.max(b,cur);
        }
        return b;
    }
}