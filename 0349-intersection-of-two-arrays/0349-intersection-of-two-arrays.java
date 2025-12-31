class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> a = new HashSet<>();
       for(int b:nums1){
        a.add(b);
       }
       HashSet<Integer> c = new HashSet<>();
       for(int b:nums2){
        if(a.contains(b)){
            c.add(b);
        }
       }
       int d[]=new int[c.size()];
       int i=0;
       for(int b:c){
        d[i++]=b;
       }
       return d;
    }
}