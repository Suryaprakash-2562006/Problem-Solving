class Solution {
    public int minMoves(int[] nums) {
        int count = 0;

        int max = nums[0];

        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }

        for(int x : nums){
            count += Math.abs((max - x));
        }
        return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna