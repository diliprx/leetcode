/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int a=1,b=n;
        while(a<b){
            int c = a + (b - a) / 2;
            if(isBadVersion(c)){
                b=c;
            }
            else{
                a=c+1;
            }
        }
        return a;
    }
}