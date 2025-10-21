class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> a = new HashMap<>();
        for(char c:s.toCharArray()){
            a.put(c,a.getOrDefault(c,0)+1);
        }
        int b=a.values().iterator().next();
        for(int c:a.values()){
            if(c!=b) return false;
        }
        return true;
    }
}