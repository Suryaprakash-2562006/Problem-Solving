class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int n : arr){
            
            currsum += n;
            
            maxSum = Math.max(maxSum,currsum);
            
            if(currsum < 0){
                currsum = 0;
            }
        }
        
        return maxSum;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna