class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
        int n = nums.size();
        for (int i = 0; i <= n - l; i++) {
            int currentSum = 0;
            for (int j = i; j < n && j < i + r; j++) {
                currentSum += nums.get(j);
                if (j - i + 1 >= l && currentSum > 0) {
                    min = Math.min(min, currentSum);
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
