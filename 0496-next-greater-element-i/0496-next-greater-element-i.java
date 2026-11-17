class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> m=new HashMap<>();
        Deque<Integer> a=new ArrayDeque<>();
        for(int i:nums2){
            while(!a.isEmpty() && i>a.peek()){
                int b=a.pop();
                m.put(b,i);
            }  
            a.push(i);
        }

        int res[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=m.getOrDefault(nums1[i],-1);
        }
        return res;

    }
}