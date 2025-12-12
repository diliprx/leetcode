class Solution {
    public boolean checkDivisibility(int n) {
        int a=0,b=1;
        int num=n;
        while(n>0){
            int c=n%10;
            a+=c;
            b*=c;
            n/=10;
        }
        int d=a+b;
        if(num%d==0){
            return true;
        }
    return false;
    }
}