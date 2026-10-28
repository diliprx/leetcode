class Solution {
    public int surfaceArea(int[][] grid) {
        int n=grid.length;
        int a=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int b=grid[i][j];

                if(b>0){
                    a+=2+(4*b);
                }
                if(i>0){
                    a-=2*Math.min(b,grid[i-1][j]);
                }
                if(j>0){
                    a-=2*Math.min(b,grid[i][j-1]);
                }
            }
        }
        return a;
    }
}