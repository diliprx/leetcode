class Solution {
    public boolean doesAliceWin(String s) {
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                return true;
            }
        }
        return false;
    }
}