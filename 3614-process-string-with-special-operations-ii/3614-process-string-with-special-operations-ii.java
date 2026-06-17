class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long[] lengths = new long[n];
        long currLen = 0;
        
        for (int i = 0; i < n; i++) {
            char b = s.charAt(i);
            if (b >= 'a' && b <= 'z') {
                currLen++;
            } else if (b == '*') {
                if (currLen > 0) currLen--;
            } else if (b == '#') {
                currLen *= 2;
            }
            lengths[i] = currLen;
        }
        
        if (k < 0 || k >= currLen) {
            return '.';
        }
        
        long currIdx = k;
        for (int i = n - 1; i >= 0; i--) {
            char b = s.charAt(i);
            long prevLen = (i > 0) ? lengths[i - 1] : 0;
            
            if (b == '%') {
                currIdx = lengths[i] - 1 - currIdx;
            } else if (b == '#') {
                if (currIdx >= prevLen) {
                    currIdx -= prevLen;
                }
            } else if (b >= 'a' && b <= 'z') {
                if (currIdx == prevLen) {
                    return b;
                }
            }
        }
        
        return '.';
    }
}
