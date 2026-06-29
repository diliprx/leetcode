class Solution {
    public int countPrimes(int n) {
       if(n<=2){
        return 0;
       } 
       boolean isprime[]=new boolean[n];
       int c=0;
       for(int i=2;i*i<n;i++){
        if(!isprime[i]){
            for(int j=i*i;j<n;j+=i){
                isprime[j]=true;
            }
        }
       }
       for(int i=2;i<n;i++){
        if(!isprime[i]){
            c++;
        }
       }
       return c;
    }
}