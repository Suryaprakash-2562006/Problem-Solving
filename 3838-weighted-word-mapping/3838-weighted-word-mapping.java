class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans = "";

        for(String w : words) {
            int sum = 0;

            for(char c : w.toCharArray()) {
                sum += weights[c - 'a'];
            }

            sum = sum % 26;
            ans += (char)('z' - sum);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna