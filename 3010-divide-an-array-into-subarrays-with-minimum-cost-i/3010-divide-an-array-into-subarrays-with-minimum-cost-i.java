class Solution {
    public int minimumCost(int[] nums) {
        int f=nums[0];
        Arrays.sort(nums,1,nums.length);
        return f+nums[1]+nums[2];
    }
}