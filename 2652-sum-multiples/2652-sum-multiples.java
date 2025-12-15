class Solution {
    public int sumOfMultiples(int n) {
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                a.add(i);
            }
        }
        int b=0;
        for(int i:a){
            b+=i;
        }
        return b;
    }
}