class Solution {
    public int triangleNumber(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int c=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            int j=0;
            int k=i-1;
            while(j<k){
                if(nums[j]+nums[k]>nums[i]){
                    c+=k-j;
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return c;
    }
}