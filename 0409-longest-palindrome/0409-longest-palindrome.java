class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> a = new HashMap<>();
        for(char c:s.toCharArray()){
            a.put(c,a.getOrDefault(c,0)+1);
        }
        int b=0;
        boolean c=false;
        for(int i:a.values()){
            if(i%2==0){
                b+=i;
            }
            else{
                b+=i-1;
                c=true;
            }
        }
        if(c){
            b++;
        }
        return b;
    }
}