import java.util.*;

class Solution {
    public int countPairs(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int count = 0;

        for (int n : nums) {

            if (hash.containsKey(n - k)) {
                count += hash.get(n - k);
            }

            if (hash.containsKey(n + k)) {
                count += hash.get(n + k);
            }

            hash.put(n, hash.getOrDefault(n, 0) + 1);
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna