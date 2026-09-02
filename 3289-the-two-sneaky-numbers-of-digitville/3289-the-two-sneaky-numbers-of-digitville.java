class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[nums.length];

        for (int x : nums) {
            freq[x]++;
        }

        int[] ans = new int[2];
        int j = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 2) {
                ans[j++] = i;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna