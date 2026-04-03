class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                a.add(nums[i]);
            }
            else{
                b.add(nums[i]);
            }
        }
        Collections.sort(a);
        Collections.sort(b,Collections.reverseOrder());
        int c=0,d=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=a.get(c++);
            }
            else{
                nums[i]=b.get(d++);
            }
        }
        return nums;
    }
}