class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int  c =0;
        for(char a:jewels.toCharArray()){
            for(char b:stones.toCharArray()){
                if(a==b){
                    c++;
                }
            }
        }
        return c;
    }
}