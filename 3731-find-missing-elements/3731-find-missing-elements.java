class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> a = new ArrayList<>();
        Set<Integer> b = new HashSet<>();
        Arrays.sort(nums);
        int f=nums[0];
        int l=nums[nums.length-1];
        int c=Integer.MIN_VALUE;
        for(int i:nums){
            b.add(i);
            c=Math.max(c,i);
        }
        for(int i=f;i<=l;i++){
            if(!b.contains(i)){
                a.add(i);
            }
        }
        return a;
    }
}