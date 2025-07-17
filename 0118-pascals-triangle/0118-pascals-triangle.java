class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> a = new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer> b = new ArrayList<>();

            for(int j=0;j<i+1;j++){
                if(j==0 || j== i){
                    b.add(1);
                }
                else{
                    int c = a.get(i-1).get(j-1)+a.get(i-1).get(j);
                    b.add(c);
                }
            }
            a.add(b);
        }
        return a;
    }
}