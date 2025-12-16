class Solution {
    public int hammingWeight(int n) {
        int c=0;
        String a=Integer.toBinaryString(n);
        char[] b=a.toCharArray();
        for(int i=0;i<b.length;i++){
            if(b[i]=='1'){
                c++;
            }
        }
        return c;
    }
}