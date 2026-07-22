class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int max = 0;

        for (char ch:s.toCharArray()) {
            if (ch == '(') {
                count++;
                max = Math.max(max, count);
            } else if (ch == ')') {
                count--;
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna