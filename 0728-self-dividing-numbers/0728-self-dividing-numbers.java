class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>c=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int a=i;
            while(a>0){
                int b=a%10;
                if(b==0 || i%b !=0){
                    break;
                }
                a/=10;
            }
            if(a==0){
                c.add(i);
            }
        }
        return c;
    }
}