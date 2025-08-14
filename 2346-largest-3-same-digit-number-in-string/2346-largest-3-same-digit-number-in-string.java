class Solution {
    public String largestGoodInteger(String num) {
       String m="";
       for(int i=0;i<=num.length()-3;i++){
        String s=num.substring(i,i+3);
        if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)) {
               
                if (m.equals("") || s.compareTo(m) > 0) {
                    m = s;
                }
            }
        }
        
        return m;
    }
}