class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        for (int h = 100; h >= 1; h--) {

            int oddSum = 0;
            int evenSum = 0;

            for (int i = 1; i <= h; i++) {
                if (i % 2 == 1)
                    oddSum += i;
                else
                    evenSum += i;
            }

            if ((red >= oddSum && blue >= evenSum) ||
                (red >= evenSum && blue >= oddSum)) {
                return h;
            }
        }

        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna