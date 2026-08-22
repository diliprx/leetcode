class Solution {
    public boolean checkDivisibility(int k) {
        int a=0,b=1;
        int c=k;
        while(c!=0){
            int n=c%10;
            a+=n;
            b*=n;
            c/=10;
        }
        int d=a+b;
        if(k%d==0){
            return true;
        }
        return false;
    }
}