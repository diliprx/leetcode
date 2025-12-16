class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer>a=new ArrayList<>();
        int n;
        for(int i=nums.length-1;i>=0;i--){
            while(nums[i]>0){
                n = nums[i]%10;
                nums[i]/=10;
                a.add(0,n);
            }
        }
        int b[]=new int[a.size()];
        for(int i=0;i<a.size();i++){
            b[i]=a.get(i);
        }
        return b;
    }
}