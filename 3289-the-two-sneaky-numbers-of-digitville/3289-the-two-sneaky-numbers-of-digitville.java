class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        int[] b=new int[2];
        int c=0;
        for(int i:nums){
            if(a.contains(i)){
                b[c]=i;
                c++;
            }
            if(c==2){
                break;
            }
            else{
                a.add(i);
            }
        }
        return b;
    }
}