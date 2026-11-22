class Solution {
    public String digitSum(String a, int k) {
         while (a.length()>k){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<a.length();i+=k){
                int sum=0;
                for(int j=i;j<i+k && j<a.length();j++){
                    sum+=a.charAt(j)-'0';
                }
                sb.append(sum);
            }
            a=sb.toString();
        }
        return a;
    }
}