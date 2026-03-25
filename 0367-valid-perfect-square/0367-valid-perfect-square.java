class Solution {
    public boolean isPerfectSquare(int num) {
       int a=1,b=num;
       while(a<=b){
        int c=a+(b-a)/2;
        long d=(long)c*c;
        if(d==num){
            return true;
        }
        else if(d>num){
            b=c-1;
        }
        else{
            a=c+1;
        }
       } 
       return false;
    }
}