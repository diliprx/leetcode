class Solution {
    public int differenceOfSum(int[] nums) {
        int c=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            c+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                int a=nums[i];
                while(a>0){
                    b+=a%10;
                    a/=10;
                }
            }
            else{
                b+=nums[i];
            }
        }
        return (int)(Math.abs(c-b));
    }
}