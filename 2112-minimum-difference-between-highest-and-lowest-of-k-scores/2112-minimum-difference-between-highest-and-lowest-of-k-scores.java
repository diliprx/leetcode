class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int a=Integer.MAX_VALUE;
        for(int i=0;i+k-1<nums.length;i++){
            a=Math.min(a,nums[i+k-1]-nums[i]);
        }
        return a;
    }
}