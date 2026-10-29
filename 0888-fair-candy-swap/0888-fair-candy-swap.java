class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int asum=0; 
        int bsum=0;
        for(int a:aliceSizes){
            asum+=a;
        }
        HashSet<Integer> c=new HashSet<>();
        for(int b:bobSizes){
            bsum+=b;
            c.add(b);
        }
        int diff=(bsum-asum)/2;
        for(int i:aliceSizes){
            int target=i+diff;
            if(c.contains(target)){
                return new int[]{i,target};
            }
        }
        return new int[0];

    }
}