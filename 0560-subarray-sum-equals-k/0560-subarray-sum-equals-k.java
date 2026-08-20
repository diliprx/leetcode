class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++){
            int cur=0;
            for(int j=i;j<n;j++){
                cur+=nums[j];
                if(cur==k){
                    res++;
                }
            }
        }
        return res;
    }
}