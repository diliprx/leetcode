class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       long n=grid.length;
       long total=n*n;
       long sum=(total*(total+1))/2;
       long sq=(total*(total+1)*(2*total+1))/6;
       long gsum=0;
       long gsq=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            long val=grid[i][j];
            gsum+=val;
            gsq+=val*val;
        }
       }
       long val1=gsum-sum;
       long val2=gsq-sq;
       val2=val2/val1;
       int repeat=(int)((val2+val1)/2);
       int miss=(int)(repeat-val1);
       return new int[]{repeat,miss}; 
    }
}