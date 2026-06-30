class Solution {
    public int numberOfSubstrings(String s) {
        int a[]=new int[3];
        int b=0;
        int n=s.length();
        int c=0;
        for(int i=0;i<n;i++){
            a[s.charAt(i)-'a']++;
            while(a[0]>0&&a[1]>0&&a[2]>0){
                c+=(n-i);
                a[s.charAt(b)-'a']--;
                b++;
            }
        }
        return c;
    }
}