class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int max = Math.max(red, blue);
        int min = Math.min(red, blue);
        int h1 = 0;
        int h2 = 0;
        int a = max;
        int b = min;
        for (int i = 1; ; i++) {
            if (i % 2 != 0) {
                if (a < i) break;
                a -= i;
            } else {
                if (b < i) break;
                b -= i;
            }
            h1++;
        }
        a = max;
        b = min;
        for (int i = 1; ; i++) {
            if (i % 2 != 0) {
                if (b < i) break;
                b -= i;
            } else {
                if (a < i) break;
                a -= i;
            }
            h2++;
        }
        return Math.max(h1, h2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna