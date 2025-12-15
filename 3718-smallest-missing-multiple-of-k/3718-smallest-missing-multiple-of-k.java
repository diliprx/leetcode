class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int x=k;
        for(int i:nums){
            if(i==x){
                x+=k;
            } 
        }
        return x;
    }
}