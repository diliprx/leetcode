class Solution {
    public int minMoves2(int[] nums) {
        long minTotalMoves = Long.MAX_VALUE; 
        
        for (int j = 0; j < nums.length; j++) {
            int target = nums[j];
            long currentTargetMoves = 0;
            
            for (int i = 0; i < nums.length; i++) {
                currentTargetMoves += Math.abs((long) nums[i] - target);
            }

            minTotalMoves = Math.min(minTotalMoves, currentTargetMoves);
        }
       
        return (int) minTotalMoves;
    }
}

     