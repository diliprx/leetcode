class Solution {
    public int minCost(String colors, int[] neededTime) {
        int a=0;
        int b=neededTime[0];
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
              a+=Math.min(b,neededTime[i]);
              b=Math.max(b,neededTime[i]);
            }
            else{
                b=neededTime[i];
            }
        }
        return a;
    }
}