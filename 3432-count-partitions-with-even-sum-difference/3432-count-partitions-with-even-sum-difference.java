class Solution {
    public int countPartitions(int[] nums) {
        int ts=0;
        for(int i:nums){
            ts+=i;
        }
        return (ts%2==0)?nums.length-1:0;
    }
}