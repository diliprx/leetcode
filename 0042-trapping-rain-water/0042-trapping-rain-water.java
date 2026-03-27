class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int lm=0;
        int rm=0;
        int t=0;
        while(l<r){
            if(height[l]<height[r]){
                if(lm<height[l]){
                    lm+=height[l];
                }
                else{
                    t+=height[l]-lm;
                }
                l++;
            }
            else{
                if(rm<height[r]){
                    rm+=height[r];
                }
                else{
                    t+=height[r]-rm;
                }
                r--;
            }
        }
        return t;
    }
}