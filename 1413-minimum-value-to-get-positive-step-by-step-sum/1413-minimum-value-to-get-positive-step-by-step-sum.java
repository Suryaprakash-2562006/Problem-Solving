class Solution {
    public int minStartValue(int[] nums) {

        int runsum = 0;
        int i = 1;

        while (true) {

            runsum = i;
            boolean ok = true;

            for (int j = 0; j < nums.length; j++) {

                runsum = runsum + nums[j];

                if (runsum < 1) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                return i;
            }

            i++;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna