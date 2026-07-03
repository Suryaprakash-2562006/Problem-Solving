class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int c = 0;
        int[] expected = new int[n];
        for(int i=0;i<n;i++){
            expected[i] = heights[i];
        }
        Arrays.sort(heights);
        for(int i=0;i<n;i++){
            if(heights[i] != expected[i]){
                c++;
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna