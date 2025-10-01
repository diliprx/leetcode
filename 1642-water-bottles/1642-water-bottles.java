class Solution {
    public int numWaterBottles(int n, int m) {
        int a=(n-1)/(m-1);
        return a+n;
    }
}