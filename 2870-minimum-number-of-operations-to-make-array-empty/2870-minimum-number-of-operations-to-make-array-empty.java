class Solution {
    public int minOperations(int[] a) {
        int mino=0;
        Map<Integer,Integer> b = new HashMap<>();
        for(int i:a){
            b.merge(i,1,Integer::sum);
        }
        for(int i:b.values()){
            if(i<2){
                return -1;
            }
            int r=i%3;
            int q=i/3;

            if(r==0){
                mino+=q;
            }
            else{
                mino+=q+1;
            }
        }
        return mino;
    }
}