class Solution {
    public int countSegments(String s) {
        if(s.replace(" ","").length()==0) return 0;
        String a[]=s.trim().split("\\s+");
        return a.length;
    }
}