class Solution {
    public int lengthOfLastWord(String s) {
        String[] a = s.split(" ");
        int n=a.length;
        return a[n-1].length();
    }
}