class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int a=n*n;
        int b=a*w;
        if(maxWeight>b){
            return a;
        }
        else{
            return maxWeight/w;
        }
    }
}