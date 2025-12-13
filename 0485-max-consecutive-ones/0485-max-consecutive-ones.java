class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a=0;
        int b=0;
        for(int i:nums){
            if(i==1){
                b++;
                a=Math.max(a,b);
            }
            else{
                b=0;
            }
        }
        return a;
    }
}