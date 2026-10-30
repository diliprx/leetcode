class Solution {
    public int islandPerimeter(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int p=0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    p+=dfs(grid,i,j);
                }
            }
        }
        return p;
    }

    public int dfs(int[][] grid,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0){
            return 1;
        }

        if(grid[r][c]==-1){
            return 0;
        }

        grid[r][c]=-1;

        return (dfs(grid,r+1,c)+dfs(grid,r-1,c)+dfs(grid,r,c-1)+dfs(grid,r,c+1));
    }
}