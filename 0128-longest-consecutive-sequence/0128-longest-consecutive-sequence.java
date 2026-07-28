class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for(int i:nums){
            a.add(i);
        }
        int max=0;

        for(int i:a){
            if(!a.contains(i-1)){
                int c=i;
                int l=1;
                while(a.contains(c+1)){
                    c++;
                    l++;
                }
                max=Math.max(max,l);
            }
        }
        return max;
    }
}