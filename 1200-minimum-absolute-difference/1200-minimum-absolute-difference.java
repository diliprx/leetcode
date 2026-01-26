class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int a=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            a=Math.min(a,arr[i+1]-arr[i]);
        }
        List<List<Integer>> b = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==a){
                b.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return b;
    }
}