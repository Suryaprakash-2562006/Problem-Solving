class Solution {
    int floorSqrt(int n) {
        // code here
        
        int ans = 0;
        
        for(long i=1;i*i <= n;i++){
            
            ans = (int)i;
            
        }
        
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna