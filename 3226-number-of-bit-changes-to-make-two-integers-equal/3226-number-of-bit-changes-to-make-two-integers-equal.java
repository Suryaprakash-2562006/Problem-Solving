class Solution {
  public int minChanges(int n, int k) {
    return (n & k) == k ? Integer.bitCount(n ^ k) : -1;
  }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna