class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int a=matrix.length;
        int b=matrix[0].length;
        int c[]=new int[a*b];
        int d=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                c[d++]=matrix[i][j];
            }
        }
        Arrays.sort(c);
        return c[k-1];
    }
}