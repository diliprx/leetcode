class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> a = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int b=target-nums[i];
            if(a.containsKey(b)){
                return new int[]{a.get(b),i};
            }
            a.put(nums[i],i);
        }
        return new int[]{};
    }
}