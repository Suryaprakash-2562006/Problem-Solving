class Solution {
    public String kthDistinct(String[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            // Count occurrences of arr[i]
            for (int j = 0; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }

            // If it occurs exactly once
            if (count == 1) {
                k--;

                if (k == 0) {
                    return arr[i];
                }
            }
        }

        return "";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna