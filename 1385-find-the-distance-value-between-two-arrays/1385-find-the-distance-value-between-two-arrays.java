class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int i:arr1){
            if(isValid(i,arr2,d))c++;
        }
        return c;
    }
    boolean isValid(int n,int[]arr,int d){
        for(int i:arr){
            if(Math.abs(i-n)<=d){
                return false;
            }
        }
        return true;
    }
}