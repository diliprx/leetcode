class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean [][]visited=new boolean[r][c];
        int co=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(grid,i,j,visited,r,c);
                    co++;
                }
            }
        }
        return co;
    }

    public void dfs(char grid[][],int r,int c,boolean[][]visited,int ro,int co){
        if(r<0 || c<0 || r>=ro || c>=co || grid[r][c]=='0' || visited[r][c]){
            return ;
        }
        visited[r][c]=true;
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        for(int i=0;i<4;i++){
            dfs(grid,r+dr[i],c+dc[i],visited,ro,co);
        }

    }
}