class Solution {

    static int majorityElement(int arr[]) {

        int candidate = 0;
        int count = 0;

        // Find candidate
        for (int num : arr) {

            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        // Verify candidate
        count = 0;

        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        return count > arr.length / 2 ? candidate : -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna