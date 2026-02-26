import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {
        BigInteger a = new BigInteger(s, 2);
        int c = 0;
        BigInteger one = BigInteger.ONE;
        BigInteger zero = BigInteger.ZERO;
        BigInteger two = BigInteger.valueOf(2);

        while (a.compareTo(one) > 0) {
           
            if (a.remainder(two).equals(one)) {
                a = a.add(one);
            } else {
                
                a = a.divide(two);
            }
            c++;
        }
        return c;
    }
}
