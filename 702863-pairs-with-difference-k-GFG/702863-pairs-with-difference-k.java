import java.util.HashMap;

class Solution {
    int countPairs(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {

            count += map.getOrDefault(num - k, 0);

            if (k != 0) {
                count += map.getOrDefault(num + k, 0);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna