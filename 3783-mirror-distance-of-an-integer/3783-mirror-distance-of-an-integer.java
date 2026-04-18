class Solution {
    public int mirrorDistance(int n) {
        int a=n;
        int b=0;
        while(n>0){
            int c=n%10;
            b=b*10+c;
            n=n/10;
        }
        return (int)(Math.abs(a-b));
    }
}