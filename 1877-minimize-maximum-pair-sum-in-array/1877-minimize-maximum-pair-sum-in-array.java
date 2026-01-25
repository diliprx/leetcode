class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int a=0,b=nums.length-1;
        int c=0;
        while(a<b){
            c=Math.max(c,nums[a++]+nums[b--]);
        }
        return c;
    }
}