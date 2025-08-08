class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int m = baskets.length;
        boolean[] used = new boolean[m];
        int unplaced = n;

        for (int fruit : fruits) {
            for (int j = 0; j < m; j++) {
                if (!used[j] && baskets[j] >= fruit) {
                    used[j] = true;
                    unplaced--;
                    break;
                }
            }
        }
        return unplaced;
    }
}