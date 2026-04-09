class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        ArrayList<Integer>a=new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                a.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int b[]=new int[a.size()];
        for(int c=0;c<a.size();c++){
            b[c]=a.get(c);
        }
        return b;
    }
}