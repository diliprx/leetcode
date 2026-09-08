class Solution {
    public int countCommas(int n) {
        int a=0;
        long b=1000;
        while(n>=b){
            a+=(n-b+1);
            b*=1000;
        }
        return a;
    }
}