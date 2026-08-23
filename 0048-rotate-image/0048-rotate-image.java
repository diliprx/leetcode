class Solution {
    public void rotate(int[][] ma) {
        int n=ma.length;
        int m=ma[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=ma[i][j];
                ma[i][j]=ma[j][i];
                ma[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int l=0;
            int r=n-1;
            while(l<r){
                int temp=ma[i][l];
                ma[i][l]=ma[i][r];
                ma[i][r]=temp;
                l++;
                r--;
            }
        }
    }
}