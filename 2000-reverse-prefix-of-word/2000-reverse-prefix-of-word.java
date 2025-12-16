class Solution {
    public String reversePrefix(String word, char ch) {
        int a=word.indexOf(ch);
        StringBuilder b=new StringBuilder(word.substring(0,a+1));
        b.reverse();
        b.append(word.substring(a+1));
        return b.toString();
    }
}