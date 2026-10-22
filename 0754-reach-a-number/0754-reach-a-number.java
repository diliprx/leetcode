class Solution {
    public int reachNumber(int target) {
        target=Math.abs(target);
        int a=0,b=0;
        while(b<target){
            a++;
            b+=a;
        }
        while((b-target)%2!=0){
            a++;
            b+=a;
        }
        return a;
    }
}