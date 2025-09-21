class Solution {
    public int maxOperations(int[] nums) {
        int a=nums[0]+nums[1];
        int b=1;
        for(int i=2;i<nums.length-1;i+=2){
            if(nums[i]+nums[i+1]==a){
                b++;
            }
            else{
            break;
            }
        }
        return b;
    }
}