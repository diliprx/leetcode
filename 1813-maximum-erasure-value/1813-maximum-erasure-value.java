class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int l=0;int cur=0;int maxsum=0;
        for(int r=0;r<nums.length;r++){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                cur-=nums[l];
                l++;
            }
            set.add(nums[r]);
            cur+=nums[r];
            maxsum=Math.max(maxsum,cur);
        }
        return maxsum;
    }
}