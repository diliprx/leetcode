class Solution {
    public boolean isAnagram(String s, String t) {
        char b[]=s.toCharArray();
        char a[]=t.toCharArray();
        Arrays.sort(b);
        Arrays.sort(a);

        return Arrays.equals(a,b);
    }
}