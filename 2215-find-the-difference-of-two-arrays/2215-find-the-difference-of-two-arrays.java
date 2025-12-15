class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>a=new HashSet<>();
        for(int i:nums1){
            a.add(i);
        }
        Set<Integer>b=new HashSet<>();
        for(int i:nums2){
            b.add(i);
        }
        ArrayList<Integer>c=new ArrayList<>();
        for(int i:a){
            if(!b.contains(i)){
                c.add(i);
            }
        }
        ArrayList<Integer>d=new ArrayList<>();
        for(int i:b){
            if(!a.contains(i)){
                d.add(i);
            }
        }
        List<List<Integer>>e=new ArrayList<>();
        e.add(c);
        e.add(d);
        return e;
    }

}