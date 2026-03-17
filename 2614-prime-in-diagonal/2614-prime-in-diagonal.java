class Solution {
    public int diagonalPrime(int[][] nums) {
        int a = 0;
        for(int i=0;i<nums.length;i++){
            int e=nums[i][i];
            int f=nums[i][nums.length-i-1];
            if(prime(e)){
                a = Math.max(a, e);
            }
            if(prime(f)){
                a = Math.max(a, f);
            }
        }
        return a;
    }
        public boolean prime(int n){
            if(n<=1) return false;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
            return true;
        }
}