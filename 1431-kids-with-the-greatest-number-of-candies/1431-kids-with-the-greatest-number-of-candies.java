class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i:candies){
            if(i>max){
                max=i;
            }
        }
        List<Boolean> res=new ArrayList<>();
        for(int i:candies){
            res.add(i+extraCandies>=max);
        }
        return res;
    }
}