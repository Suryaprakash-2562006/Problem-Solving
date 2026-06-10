class Solution {
    public int mySqrt(int x) {
        /*int sqrt = (int)Math.sqrt(x);
        return sqrt;*/

        int ans = 0;

        for(long i=1;i*i <= x;i++){
            ans = (int)i;
        }

        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna