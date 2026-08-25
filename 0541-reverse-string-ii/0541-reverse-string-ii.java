class Solution {
    public String reverseStr(String s, int k) {
        char arr[]=s.toCharArray();
        for(int i=0;i<s.length();i+=2*k){
            int st=i;
            int e=Math.min(i+k-1,arr.length-1);
            while(st<e){
                char temp=arr[st];
                arr[st]=arr[e];
                arr[e]=temp;
                st++;
                e--;
            }
        }
        String res= new String(arr);
        return res;
    }
}