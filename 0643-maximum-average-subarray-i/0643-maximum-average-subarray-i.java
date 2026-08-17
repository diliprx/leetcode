class Solution { 
    public double findMaxAverage(int[] nums, int k) { 
        double kd = (double)k; 
        // 1. Initialize b to the lowest possible value to handle negative answers
        double b = -Double.MAX_VALUE; 
        
        // 2. Change < to <= to include the final window
        for(int i = 0; i <= nums.length - k; i++){ 
            int j = i + k - 1; 
            
            // 3. Reset the sum 'a' for every new window
            int a = 0; 
            
            for(int m = i; m <= j; m++){ 
                a += nums[m]; 
            } 
            
            // 4. Calculate the average using a double cast to prevent integer truncation
            double cur = (double)a / kd; 
            b = Math.max(b, cur); 
        } 
        return b; 
    } 
}
