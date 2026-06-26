class Solution {
    public int findClosest(int x, int y, int z) {

        int diff1 = Math.abs(x-z);
        int diff2 = Math.abs(y-z);

        if(diff1 - diff2 == 0) return 0;

        int small = (diff1 < diff2) ? 1 : 2;

        return small;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna