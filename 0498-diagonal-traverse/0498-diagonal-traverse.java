class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int a=mat.length;
        int b=mat[0].length;
        int c=0;
        int d[]=new int[a*b];
        for(int i=0;i<a+b-1;i++){
            List<Integer>aa=new ArrayList<>();
            int r=(i<b)?0:i-b+1;
            int co=(i<b)?i:b-1;
             while(r < a && co >= 0) {
                aa.add(mat[r][co]);
                r++;
                co--;
            }
            
            if(i % 2 == 0) {
                Collections.reverse(aa);
            }
            
            for(int num : aa) {
                d[c++] = num;
            }
        }
        return d;
    }
}