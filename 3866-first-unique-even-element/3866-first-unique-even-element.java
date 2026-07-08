class Solution {
    public int firstUniqueEven(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {

                boolean unique = true;
                for (int j = 0; j < nums.length; j++) {

                    if (i != j && nums[i] == nums[j]) {
                        unique = false;
                        break;
                    }
                }
                if (unique) {
                    return nums[i];
                }
            }
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna