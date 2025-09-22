class Solution {
    public int maxFreqSum(String s) {
       int[]a=new int[26];
       int v=0,c=0;
       for(char i:s.toCharArray()){
        int j=i-'a';
        a[j]++;
        if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'){
            v=Math.max(a[j],v);
        }
        else{
            c=Math.max(a[j],c);
        }
       }
       return v+c;
    }
}