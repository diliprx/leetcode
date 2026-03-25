class Solution {
    public boolean isHappy(int n) {
        while(n>9){
            int r=0;
            while(n>0){
                r+=((n%10)*(n%10));
                n/=10;
            }
            n=r;
        }
        if(n==1 || n==7){
            return true;
        }
        return false;
    }
}