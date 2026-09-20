class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
           char a=s.charAt(i);
           int ascii='z'-a+1;
           int index=i+1;
           sum+=(ascii*index);
        }
        return sum;
    }
}