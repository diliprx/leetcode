class Solution {
    public int findPeakElement(int[] nums) {
    int max=Integer.MIN_VALUE;
    int maxi=0;
    for(int i=0;i<nums.length;i++){
       if(max<nums[i]){
        max=nums[i];
        maxi=i;
       }
    }
    return maxi;
        
    }
}