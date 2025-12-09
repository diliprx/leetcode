class Solution {
    public int countTriples(int n) {
      int count =0;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
           int a=i*i;
           int b=j*j;
           int c=a+b;
           int d=(int)Math.sqrt(c);
           if(d<=n && d*d==c){
            count++;
           }
        }
      }
      return count;
    }
}