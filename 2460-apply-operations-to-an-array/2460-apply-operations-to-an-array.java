class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                nums[i-1]=nums[i-1]*2;
                nums[i]=0;
            }
        }
        int res[]=new int[nums.length];
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                res[a]=nums[i];
                a++;
            }
        }
        System.out.print(Arrays.toString(nums));
        return res;
    }
}