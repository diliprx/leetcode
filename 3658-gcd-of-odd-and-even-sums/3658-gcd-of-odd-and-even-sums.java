class Solution {
    public int gcdOfOddEvenSums(int n) {
        int o=0;
        int e=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                e+=i;
            }
            else{
                o+=i;
            }
        }
        return gcd(e,o);
    }
    public int gcd(int e, int o){
        while(e != 0){
            int c = e;
            e = o % e;
            o = c;
        }
        return o;
    }
}