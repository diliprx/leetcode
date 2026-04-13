class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int a=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int b=Math.abs(i-start);
                a=Math.min(a,b);
            }
        }
        return a;
    }
}