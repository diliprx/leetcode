class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       HashSet<Integer> a = new HashSet<>();
       ArrayList<Integer> c=new ArrayList<>();
       for(int b:nums){
        if(a.contains(b)){
            c.add(b);
        }
        else{
            a.add(b);
        }
       }
       return c;
    }
}