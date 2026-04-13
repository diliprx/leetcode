class Solution {
    public boolean isNumber(String s) {
        boolean n=false,e=false,si=false,d=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0'&&c<='9') n= true;
            else if(c=='e'||c=='E'){
                if(e||!n)return false;
                else{
                    e=true;
                    si=false;
                    n=false;
                    d=false;
                }
            }
            else if(c=='+' || c=='-')
               if(si||n||d)return false;
               else si=true;
            else if(c=='.')
               if(d||e)return false;
               else d=true;
            else return false;
        }
        return n;
    }
}