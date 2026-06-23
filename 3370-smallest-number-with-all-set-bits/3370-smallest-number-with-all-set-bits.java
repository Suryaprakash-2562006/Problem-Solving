class Solution {
    public int smallestNumber(int n) {

        while (true) {

            String binary = Integer.toBinaryString(n);

            boolean allOnes = true;

            for (int i = 0; i < binary.length(); i++) {
                if (binary.charAt(i) == '0') {
                    allOnes = false;
                    break;
                }
            }

            if (allOnes) {
                return n;
            }

            n++;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna