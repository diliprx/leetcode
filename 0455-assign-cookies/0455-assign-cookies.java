class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int a=g.length;
        int b=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0;
        int d=0;
        int e=0;
        while(d<a && e<b){
            if(s[e]>=g[d]){
                d++;
                c++;
            }
            e++;
        }
        return c;
    }
}