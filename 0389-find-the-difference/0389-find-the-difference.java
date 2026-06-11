class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;

        for (char c : t.toCharArray()) sum += c;
        for (char c : s.toCharArray()) sum -= c;

        return (char) sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna