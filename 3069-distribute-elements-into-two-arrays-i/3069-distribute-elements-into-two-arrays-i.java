class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int a1[] = new int[n];
        int a2[] = new int[n];
        a1[0] = nums[0];
        a2[0] = nums[1];
        int a1l=1;
        int a2l=1;
        for (int i = 2; i < n; i++) {
            if (a1[a1l - 1] > a2[a2l - 1]) {
                a1[a1l] = nums[i];
                a1l++;
            } else {
                a2[a2l] = nums[i];
                a2l++;
            }
        }
        int res[] = new int[n];
        System.arraycopy(a1, 0, res, 0, a1l);
        System.arraycopy(a2, 0, res, a1l, a2l);
        return res;
    }
}