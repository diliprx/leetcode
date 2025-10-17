class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> a=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length -1;
            while(j<k){
                int b=nums[i]+nums[j]+nums[k];

                if(b>0){
                    k--;
                }
                else if(b<0){
                    j++;
                }
                else{
                    a.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;

                    while(nums[j]==nums[j-1]&&j<k){
                        j++;
                    }
                }
            }
        }
        return a;
    }
}