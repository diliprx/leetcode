class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>a=new HashMap<>();
        for(char b:s.toCharArray()){
            a.put(b,a.getOrDefault(b,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(a.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}