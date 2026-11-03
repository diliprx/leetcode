class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int tm=0;
        for(int i:nums){
            tm+=(max-i);
            System.out.println(tm);
        }
        return tm;
    }
}