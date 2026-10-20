class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> a =new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                a.add(i);
            }
        }
        return a;
    }
}