class Solution {
    public int fillCups(int[] amount) {

        int total = amount[0] + amount[1] + amount[2];

        int max = Math.max(amount[0],
                  Math.max(amount[1], amount[2]));

        return Math.max(max, (total + 1) / 2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna