class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> a = new HashSet<>();
        for(int i:nums){
            a.add(i);
        }
        List<Integer> b = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!a.contains(i)){
                b.add(i);
            }
        }
        return b;
    }
}