class Solution {
    public int countDigits(int num) {
        int a=num;
        int b=0;
        while(num>0){
            if(a%(num%10)==0) b++;
            num/=10;
        }
        return b;
    }
}