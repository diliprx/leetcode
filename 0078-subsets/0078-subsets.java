class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // List<List<Integer>> a = new ArrayList<>();
        // a.add(new ArrayList<>());
        // for(int i=0;i<=nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         ArrayList<Integer> b= new ArrayList<>();
        //         for(int k=i;k<=j;k++){
        //             b.add(nums[k]);
        //         }
        //         a.add(b);
        //     }
        // }
        // return a;

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // empty subset

        for (int num : nums) {
            int size = result.size();

            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(result.get(i));
                newSubset.add(num);
                result.add(newSubset);
            }
        }
        return result;
    }
}