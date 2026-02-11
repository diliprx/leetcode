class Solution {
    public boolean isValid(String s) {
        Stack<Character>b=new Stack<>();
        for(char a:s.toCharArray()){
            if(a=='('||a=='{'||a=='['){
                b.push(a);
            }
            else{
                if(b.isEmpty()){
                    return false;
                }
                char c=b.pop();
                if(a=='}' && c!='{'){
                    return false;
                }
                 if(a==')' && c!='('){
                    return false;
                }
                 if(a==']' && c!='['){
                    return false;
                }
            }
        }
        return b.isEmpty();
    }
}