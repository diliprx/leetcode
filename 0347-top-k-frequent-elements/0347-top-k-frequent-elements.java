class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>a= new HashMap<>();
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        ArrayList<Map.Entry<Integer,Integer>>l=new ArrayList<>(a.entrySet());
        Collections.sort(l,(b,c)->c.getValue()-b.getValue());
        int e[]=new int[k];
        for(int i=0;i<k;i++){
            e[i]=l.get(i).getKey();
        }
        return e;
    }
}