// class Solution {
//     public int countIslands(int[][] grid, int k) {
//         if(grid==null || grid.length==0 || grid[0].length==0){
//             return 0;
//         }
//         int r=grid.length;
//         int c=grid[0].length;
//         boolean patheten[][]=new boolean[r][c];
//         int count=0;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 if(!patheten[i][j] && grid[i][j]>0){
//                     int sum=dfs(grid,i,j,patheten,r,c);

//                     if(sum%k==0){
//                         count++;
//                     }
//                 }
//             }
//         }
//         return count;
//     }
//     public int dfs(int grid[][],int r,int c,boolean[][]patheten,int ro,int co){
//         if(r<0 || r>=ro || c<0 || c>=co || patheten[r][c] || grid[r][c]<=0){
//             return 0;
//         }

//         patheten[r][c]=true;
//         int cursum=grid[r][c];
//         int dr[]={-1,1,0,0};
//         int dc[]={0,0,-1,1};
//         for(int i=0;i<4;i++){
//             cursum+=dfs(grid,r+dr[i],c+dc[i],patheten,ro,co);
//         }
//         return cursum;
//     }
// }


class Solution {
    public int countIslands(int[][] grid, int k) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Land is strictly positive (> 0) and unvisited
                if (!visited[i][j] && grid[i][j] > 0) {
                    long islandSum = dfs(grid, i, j, visited, m, n);
                    
                    if (islandSum % k == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private long dfs(int[][] grid, int r, int c, boolean[][] visited, int m, int n) {
        // Base Case: out of bounds, already visited, or water (<= 0)
        if (r < 0 || r >= m || c < 0 || c >= n || visited[r][c] || grid[r][c] <= 0) {
            return 0;
        }

        visited[r][c] = true;
        long sum = grid[r][c];

        // 4 Directions: Up, Down, Left, Right
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            sum += dfs(grid, r + dr[i], c + dc[i], visited, m, n);
        }

        return sum;
    }
}