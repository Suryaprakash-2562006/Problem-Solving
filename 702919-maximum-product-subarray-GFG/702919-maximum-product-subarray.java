class Solution {
    int maxProduct(int[] arr) {

        int prefix = 1;
        int suffix = 1;

        int ans = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {

            if(prefix == 0)
                prefix = 1;

            if(suffix == 0)
                suffix = 1;

            prefix *= arr[i];
            suffix *= arr[arr.length - 1 - i];

            ans = Math.max(ans,
                    Math.max(prefix, suffix));
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna