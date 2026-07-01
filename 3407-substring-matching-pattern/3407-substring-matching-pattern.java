class Solution {
    public boolean hasMatch(String s, String p) {
        int a=p.indexOf("*");
        int b=s.indexOf(p.substring(0,a));
        int c=s.indexOf(p.substring(a+1),b+a);
        if(b!=-1 && c!=-1){
            return true;
        }
        return false;
    }
}