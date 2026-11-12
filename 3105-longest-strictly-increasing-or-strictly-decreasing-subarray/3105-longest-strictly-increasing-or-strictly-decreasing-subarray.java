class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int a=1,b=1,c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                b++;
                c=1;
            }
            else if(nums[i]<nums[i-1]){
                c++;
                b=1;
            }
            else{
                b=1;
                c=1;
            }
            a=Math.max(a,Math.max(b,c));
        }
        return a;
    }
}