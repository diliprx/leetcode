class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for(int i:nums){
            if(!a.add(i)){
                return i;
            }
        }
        return -1;
    }
}