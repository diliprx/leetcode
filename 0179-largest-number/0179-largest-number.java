class Solution {
    public String largestNumber(int[] nums) {
        String []a=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(a,(e,b)->(b+e).compareTo(e+b));
        if(a[0].equals("0")) return "0";
        StringBuilder c = new StringBuilder();
        for(String d:a){
            c.append(d);
        }
        return c.toString();
    }
}