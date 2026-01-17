class Solution {
    public boolean isThree(int n) {
        int c=0;
        boolean a=true;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c<3 || c>3){
            a=false;
        }
        return a;
    }
}