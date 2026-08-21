class Solution {
    public String removeStars(String s) {
        Stack<Character>b=new Stack<>();
        for(char a:s.toCharArray()){
            if(Character.isLetter(a)){
                b.push(a);
            }
            else if(a=='*'){
                b.pop();
            }
        }
        StringBuilder c= new StringBuilder();
        for(char d:b){
            c.append(d);
        }
        return c.toString();
    }
}