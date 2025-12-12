class Solution {
    public boolean isBalanced(String num) {
        int a=0,b=0; 
        for(int i=0;i<=num.length()-1;i++){
            int c=num.charAt(i)-'0';
            if(i%2!=0){
                a+=c;
            }
            else{
                b+=c;
            }
        }
        return a==b;
    }
}