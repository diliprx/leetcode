class Solution {
    public int smallestNumber(int n, int t) {
        while(proudctnum(n) % t != 0) {
            n++;
        }
        return n;
    }

    public int proudctnum(int a) {
        int p = 1;
        while (a != 0) {
            p *= (a % 10);
            a /= 10;
        }
        return p;
    }
}