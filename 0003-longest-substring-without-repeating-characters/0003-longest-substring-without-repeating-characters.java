class Solution {
    public int lengthOfLongestSubstring(String s) {
      int l=0,r=0;
      int maxLen = Math.min(s.length(),1);

      Set<Character> a= new HashSet<>();
      while(r<s.length()){
        char c = s.charAt(r);
        while(a.contains(c)){
            a.remove(s.charAt(l));
            l++;
        }
        a.add(c);
        int n=r-l+1;
        maxLen=Math.max(maxLen,n);
        r+=1;
      }
      return maxLen;
      
    }
}