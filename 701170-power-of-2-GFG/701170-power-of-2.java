class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        
        if(n <= 0) return false;
        if(n==1) return true;
        
        int base = 1;
        
        while(base < n){
            base *= 2;
        }
        
        return base==n;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna