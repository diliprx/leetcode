class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> a = new HashSet<>();
       for(int c:nums){
        if(!a.add(c)){
            return true;
        }
       }
       return false;
    }
}