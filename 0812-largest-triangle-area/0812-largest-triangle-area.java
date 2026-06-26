class Solution {
    public double largestTriangleArea(int[][] points) {
       int n=points.length;
       if(n<3){
        return 0.00;
       }
       long max=0;
       for(int i=0;i<n-2;i++){
        for(int j=i+1;j<n-1;j++){
            for(int k=j+1;k<n;k++){
                long x1=points[i][0],y1=points[i][1];
                long x2=points[j][0],y2=points[j][1];
                long x3=points[k][0],y3=points[k][1];
                long curr=Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
                if(curr>max){
                    max=curr;
                }
            }
        }
       }
       return max/2.0;
        
    }
}