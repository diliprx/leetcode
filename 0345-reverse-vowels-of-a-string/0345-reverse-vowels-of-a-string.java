class Solution {
    public String reverseVowels(String s) {
        char a[]=s.toCharArray();
        int b=0;
        int c=s.length()-1;
        String d="aeiouAEIOU";
        while(b<c){
            while(b<c && d.indexOf(a[b])==-1){
                b++;
            }
            while(b<c && d.indexOf(a[c])==-1){
                c--;
            }
            char e=a[b];
            a[b]=a[c];
            a[c]=e;

            b++;
            c--;
        }
       String f=new String(a);
       return f;
        
    }
}