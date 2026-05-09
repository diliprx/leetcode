class Solution {

    public int rotatedDigits(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (isGood(i)) {
                count++;
            }
        }

        return count;
    }

    public boolean isGood(int a) {

        boolean c = false;

        while (a > 0) {

            int b = a % 10;

            if (b == 3 || b == 4 || b == 7) {
                return false;
            }

            if (b == 2 || b == 5 ||
                    b == 6 || b == 9) {

                c = true;
            }

            a /= 10;
        }

        return c;
    }
}