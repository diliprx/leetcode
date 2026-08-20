class Solution {
    public String longestPalindrome(String s) {
       int l=s.length();
       int maxl=0;
       String maxs="";
       for(int i=0;i<l;i++){
        for(int j=i+1;j<=l;j++){
            if(palindrome(s.substring(i,j)) && maxl<(j-i)){
                maxs=s.substring(i,j);
                maxl=j-i;
            }
        }
       }
       return maxs;
    }
    public boolean palindrome(String a){
        int l=0;
        int r=a.length()-1;
        while(l<r){
            if(a.charAt(l)!=a.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}