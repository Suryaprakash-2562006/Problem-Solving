class Solution {
    public int minChanges(int n, int k) {

        if ((n & k) != k) {
            return -1;
        }

        return Integer.bitCount(n ^ k);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna