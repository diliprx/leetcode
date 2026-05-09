class Solution {
    public int maxRotateFunction(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
        int c=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            c += nums[i];
            m += i * nums[i];
        }
        int ma = m;
        int cu = m;
        for (int k = 1; k < nums.length; k++) {

            cu = cu + c - nums.length * nums[nums.length - k];

            ma = Math.max(ma, cu);
        }
        return ma;
    }
}