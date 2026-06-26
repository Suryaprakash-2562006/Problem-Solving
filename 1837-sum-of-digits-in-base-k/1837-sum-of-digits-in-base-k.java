class Solution {
    public int sumBase(int n, int k) {

        int rem = 0;

        while(n > 0){
            rem += n % k;
            n /= k;
        }

        return rem;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna