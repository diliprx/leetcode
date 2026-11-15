class Solution {
    public int numOfSubarrays(int[] arr) {
        int oddCount = 0;
        int evenCount = 1; 
        int currentSum = 0;
        int totalSubarrays = 0;
        int MOD = 1000000007;

        for (int num : arr) {
            currentSum += num;

            if (currentSum % 2 != 0) {
                totalSubarrays = (totalSubarrays + evenCount) % MOD;
                oddCount++;
            } else {
                totalSubarrays = (totalSubarrays + oddCount) % MOD;
                evenCount++;
            }
        }

        return totalSubarrays;
    }
}
