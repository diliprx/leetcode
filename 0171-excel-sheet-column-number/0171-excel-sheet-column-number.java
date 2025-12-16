class Solution {
    public int titleToNumber(String c) {
        int a=0;
        for(int i=0;i<c.length();i++){
            a=a*26+(c.charAt(i)-'A'+1);
        }
        return a;
    }
}