class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;

        for (String s : strs) {
            boolean isNumber = true;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                    isNumber = false;
                    break;
                }
            }

            int value;

            if (isNumber) {
                value = Integer.parseInt(s);
            } else {
                value = s.length();
            }

            max = Math.max(max, value);
        }

        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna