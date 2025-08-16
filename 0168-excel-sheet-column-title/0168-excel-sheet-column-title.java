class Solution {
    public String convertToTitle(int c) {
        StringBuilder a = new StringBuilder();
        while(c>0){
            c--;
            a.insert(0,(char)(c%26+'A'));
            c/=26;
        }
        return a.toString();
    }
}