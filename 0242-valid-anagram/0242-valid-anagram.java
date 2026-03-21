class Solution {
    public boolean isAnagram(String s, String t) {
        char b[]=s.toCharArray();
        char c[]=t.toCharArray();
        Arrays.sort(b);
        Arrays.sort(c);
        if(b.length!=c.length){
            return false;
        }
        return Arrays.equals(b,c);
    }
}