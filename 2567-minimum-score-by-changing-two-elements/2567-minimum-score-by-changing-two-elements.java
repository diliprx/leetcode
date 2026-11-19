class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int a=nums[nums.length-1]-nums[2];
        int b=nums[nums.length-3]-nums[0];
        int c=nums[nums.length-2]-nums[1];

        return Math.min(a,Math.min(b,c));
    }
}
