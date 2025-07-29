class Solution {
    public int addDigits(int num) {
        if(num<10) return num;
        if(num%9==0) return 9;
        int a=num/9;
        return num-(9*a);
    }
}