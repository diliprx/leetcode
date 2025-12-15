class Solution {
    public int alternatingSum(int[] nums) {
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                a+=nums[i];
            }
            else{
                b+=nums[i];
            }
        }
        return a-b;
    }
}