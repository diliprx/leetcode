class Solution {
    public int heightChecker(int[] h) {
        int a=0;
        int []b=Arrays.copyOf(h ,h.length);
        Arrays.sort(h);
        for(int i=0;i<h.length;i++){
            if(b[i]!=h[i]){
                a++;
            }
        }
        return a;
    }
}