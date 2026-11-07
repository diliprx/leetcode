class Solution {
    public String convert(String s, int n) {
        if(n==1 || s.length()<=n){
            return s;
        }
        String a="";
        for(int i=0;i<n;i++){
            int j=i;
            int d=1;
            while(j<s.length()){
                a+=s.charAt(j);

                if(i==0 || i==n-1){
                    j+=(n-1)*2;
                }
                else if(d%2!=0){
                    j+=(n-1)*2-(2*i);
                }
                else{
                    j+=(2*i);
                }
                d++;
            }
        }
        return a;

    }
}