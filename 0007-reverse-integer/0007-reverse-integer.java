class Solution {
    public int reverse(int x) {
        boolean flag=true;
        if(x<0){
            flag=false;
        }
        x=Math.abs(x);
        long rev=0;
        while(x>0){
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
            if(rev>Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
                return 0;
            }
        }
        if(!flag){
            return (int)rev*-1;
        }
        
        return (int)rev;
    }
}