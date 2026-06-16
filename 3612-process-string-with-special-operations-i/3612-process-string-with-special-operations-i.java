class Solution {
    public String processStr(String s) {
        StringBuilder a=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(b>='a' && b<='z'){
                a.append(b);
            }
            else if(b=='*'){
                if(a.length()>0){
                    a.deleteCharAt(a.length()-1);
                }
            }
            else if(b=='#'){
                a.append(a.toString());
            }
            else if(b=='%'){
                a.reverse();
            }
        }
        return a.toString();
        
    }
}