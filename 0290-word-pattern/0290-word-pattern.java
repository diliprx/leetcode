class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] w=s.split(" ");
        if(w.length!=pattern.length()) return false;
        
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String wo=w[i];

            if(map.containsKey(c)){
                if(!map.get(c).equals(wo)){
                    return false;
                }
            }
            else{
                if(map.containsValue(wo)){
                    return false;
                }
                map.put(c,wo);
            }
        }
        return true;
    }
}